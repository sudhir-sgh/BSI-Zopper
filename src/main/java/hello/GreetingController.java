package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.journaldev.spring.di.consumer.SecondXMLApplication;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        
    	ClassPathXmlApplicationContext newContext = new ClassPathXmlApplicationContext(
				"second_applicationContext.xml");
		SecondXMLApplication app_1 = (SecondXMLApplication)newContext.getBean("MyXMLApp_1");
		//TwitterService twitterRef = (TwitterService)newContext.getBean("twitter");
		
		//app_1.setService(twitterRef);

		app_1.processMessage("Hi Rahul", "varun@abc.com");

		// close the context
		newContext.close();
    	
    	return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
}
