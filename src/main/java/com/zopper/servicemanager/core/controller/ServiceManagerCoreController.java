package com.zopper.servicemanager.core.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zopper.servicemanager.core.interfaces.ServiceRequestRetrievalIF;
import com.zopper.servicemanager.core.manager.ServiceRequestRetrievalManager;
import com.zopper.servicemanager.core.pojo.Response;
import com.zopper.servicemanager.core.pojo.ServiceRequest;

@RestController
public class ServiceManagerCoreController {
	
	// Get it Injected
	private ServiceRequestRetrievalIF retrievalRef;

    @RequestMapping(value="/serviceRequest",method = RequestMethod.GET)
    public ServiceRequest getServiceRequest(@RequestParam(value="orderItemId") String name) {
    	
    	ServiceRequest serviceRequestRef = null;
    	
    	String orderItemId=name;
    	
    	retrievalRef = new ServiceRequestRetrievalManager();
    	
    	serviceRequestRef = retrievalRef.getServiceRequestInfo(orderItemId);
    			
    	return serviceRequestRef;
    }
    
    @RequestMapping(value="/serviceRequest",method = RequestMethod.POST)
    public Response createServiceRequest(ServiceRequest incomingData) {
    	
    	Response responseRef = null;
    	
    	retrievalRef = new ServiceRequestRetrievalManager();
    	
    	responseRef = retrievalRef.createNewServiceRequest(incomingData);
    			
    	return responseRef;
    }
}
