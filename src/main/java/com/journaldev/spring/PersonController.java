package com.journaldev.spring;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.journaldev.spring.model.Person;
import com.journaldev.spring.pojo.OrderData;
import com.journaldev.spring.pojo.PersonData;
import com.journaldev.spring.pojo.RequestResponse;
import com.journaldev.spring.service.PersonService;

@Controller
public class PersonController {
	
	private PersonService personService;

	Logger logger  = Logger.getLogger(PersonController.class);

	@Autowired
    private MailSender mailSender;
    
	
	@Autowired(required=true)
	@Qualifier(value="personService")
	public void setPersonService(PersonService ps){
		this.personService = ps;
	}
	/*
	@RequestMapping(value = "/persons", method = RequestMethod.GET)
	public String listPersons(Model model) {
		model.addAttribute("person", new Person());
		model.addAttribute("listPersons", this.personService.listPersons());
		return "person";
	}
	*/
	
	@RequestMapping(value= "/person/add", method = RequestMethod.POST,consumes="application/json",produces="application/json")
	@ResponseBody public RequestResponse addPerson(@Valid @RequestBody PersonData p, BindingResult result){
		
		RequestResponse responseRef = new RequestResponse();
		
		Person pRef = new Person();
		
		if(result.hasErrors())
		{
			System.out.println("Validation Error Found !!!");
			List<FieldError> errorList = result.getFieldErrors();
			for (FieldError errorRef:errorList)
			{
				System.out.println("Error Found: " + errorRef.getField());
				System.out.println("Error Message: " + errorRef.getDefaultMessage());
			}
		}
		
		if(p.getPersonId()==null || p.getPersonId().equals("")){
			
			System.out.println("New Person case, add its data");
			
			// Convert the Incoming JSON to Database POJO
			
			pRef.setCountry(p.getCountryname());
			pRef.setName(p.getPersonName());
			
			this.personService.addPerson(pRef);
		}else{
			//existing person, call update
			System.out.println("Existing person, call update");
			
			this.personService.updatePerson(pRef);
		}
		
		responseRef.setStatus("SUCCESS");
		responseRef.setErrorMessage("No Error");
		
		return responseRef;
	}
	
	@RequestMapping(value="/person/remove/",method = RequestMethod.POST,consumes="application/json",produces="application/json")
	@ResponseBody public RequestResponse removePerson(@RequestParam(value="personId") int id){
		
		RequestResponse responseRef = new RequestResponse();
		
        this.personService.removePerson(id);
        
        responseRef.setStatus("SUCCESS");
		responseRef.setErrorMessage("No Error");
        return responseRef;
    }
	
	@RequestMapping(value="/person/onboardData/",method = RequestMethod.GET,produces="application/json")
	@ResponseBody public String onboardOrderData(@RequestParam(value="orderId") int id){
		
		System.out.println("Order being processed: " + id);
		
		String orderFetchURL = "http://45.56.118.248/sales/orders/" + id + "/";
		
		RestTemplate restTemplate = new RestTemplate();
		OrderData personData = restTemplate.getForObject(orderFetchURL, OrderData.class);
		
		if( personData == null)
		{
			System.out.println("No order data found with this order ID ");
		}
		else
		{
			System.out.println(personData);
		}
       
        return "Order Data Processed";
    }
	
	@RequestMapping(value="/person/get/",method = RequestMethod.GET,produces="application/json")
	@ResponseBody public PersonData getPerson(@RequestParam(value="personId") int id){
		
		PersonData personData = new PersonData();
		
        Person p = this.personService.getPersonById(id);
        
        personData.setCountryname(p.getCountry());
        personData.setPersonName(p.getName());
        personData.setPersonId(p.getId()+"");
        
        return personData;
    }
	
	@RequestMapping(value="/person/getFromWS/",method = RequestMethod.GET,produces="application/json")
	@ResponseBody public PersonData getPersonFromWS(@RequestParam(value="personId") int id){
		
		
		String fetchURL = "http://localhost:8080/person/get/?personId=" + id ;
		
		RestTemplate restTemplate = new RestTemplate();
		PersonData personData = restTemplate.getForObject(fetchURL, PersonData.class);
		
		if( personData == null)
		{
			System.out.println("No person data found with this order ID ");
		}
		else
		{
			System.out.println(personData);
		}
        
        return personData;
    }
	
	
	@RequestMapping(value="/person/sendEmail/",method = RequestMethod.GET)
	@ResponseBody public String sendEmail(@RequestParam(value="message") String emailMessage){
		
		SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("rahul.gupta@zopper.com");
        message.setFrom("brand-cust-care@zopper.com");
        message.setSubject("Test Email Service");
        message.setText(emailMessage);
        
        mailSender.send(message);
        
        return "Email Sent";
    }
    
	
	@RequestMapping(value="/person/personList/",method = RequestMethod.GET,produces="application/json")
	@ResponseBody public List<PersonData> getPersonList(){
		
		List<PersonData> personDataList = new ArrayList<PersonData>();
		
        List<Person> personList = this.personService.listPersons();
        
        PersonData pRef = null;
        
        for(Person p:personList)
        {
        	pRef = new PersonData();
        	
        	pRef.setCountryname(p.getCountry());
        	pRef.setPersonName(p.getName());
        	pRef.setPersonId(p.getId()+"");
            
            personDataList.add(pRef);
        }
        
        return personDataList;
    }
 
    @RequestMapping(value="/person/update/",method = RequestMethod.POST,consumes="application/json")
    @ResponseBody public RequestResponse updatePerson(@RequestBody PersonData p)
    {
    	
    	RequestResponse responseRef = new RequestResponse();
		
		Person pRef = new Person();
		
		if(p.getPersonId()!=null && !p.getPersonId().equals(""))
		{
		
			pRef.setId(Integer.parseInt(p.getPersonId()));
			pRef.setCountry(p.getCountryname());
			pRef.setName(p.getPersonName());
			
			this.personService.updatePerson(pRef);
			
			responseRef.setStatus("SUCCESS");
			responseRef.setErrorMessage("No Error");
		}
		else
		{
			System.out.println("ID is not available in the Incoming message..hence returning error..");
			responseRef.setStatus("FAILURE");
			responseRef.setErrorMessage("Person ID is not available");
		}	
		
        return responseRef;
    }
	
	/*
	
	//For add and update person both
	@RequestMapping(value= "/person/add", method = RequestMethod.POST)
	public String addPerson(@ModelAttribute("person") Person p){
		
		if(p.getId() == 0){
			//new person, add it
			this.personService.addPerson(p);
		}else{
			//existing person, call update
			this.personService.updatePerson(p);
		}
		
		return "redirect:/persons";
		
	}
	
	
	@RequestMapping("/remove/{id}")
    public String removePerson(@PathVariable("id") int id){
		
        this.personService.removePerson(id);
        return "redirect:/persons";
    }
 
    @RequestMapping("/edit/{id}")
    public String editPerson(@PathVariable("id") int id, Model model){
        model.addAttribute("person", this.personService.getPersonById(id));
        model.addAttribute("listPersons", this.personService.listPersons());
        return "person";
    }
    
    */



	@RequestMapping(value="/update-log-level",method = RequestMethod.GET,produces="application/json")
	@ResponseBody public String updateLogLevel(@RequestParam Level level){
		if (level != null){
			LogManager.getRootLogger().setLevel(level);
		}
		return level.toString();
	}

	@RequestMapping(value="/check-log-level",method = RequestMethod.GET,produces="application/json")
	@ResponseBody public String checkLogLevel(@RequestParam Level level){
		logger.info("----------------- info level log ---------------");
		logger.debug("----------------- info level log ---------------");
		logger.error("----------------- info level log ---------------");
		return LogManager.getRootLogger().getLevel().toString();
	}


}
