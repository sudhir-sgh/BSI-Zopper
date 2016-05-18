package com.zopper.servicemanager.core.manager;

import com.zopper.servicemanager.core.interfaces.ServiceRequestRetrievalIF;
import com.zopper.servicemanager.core.persistence.interfaces.ServiceRequestPersistenceManagerFactoryIF;
import com.zopper.servicemanager.core.pojo.PersistenceResponse;
import com.zopper.servicemanager.core.pojo.Response;
import com.zopper.servicemanager.core.pojo.ServiceRequest;

public class ServiceRequestRetrievalManager implements ServiceRequestRetrievalIF {

	// Get it Injected
	ServiceRequestPersistenceManagerFactoryIF factoryIF = null;
	
	@Override
	public ServiceRequest getServiceRequestInfo(String orderItemIdValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response createNewServiceRequest(ServiceRequest requestData) {
		// TODO Auto-generated method stub
		
		/**
		 * Choose the right persistence Manager using a factory based
		 * approach.
		 * For example,for brand A, an appropriate persistence manager needs to 
		 * be identified and called using the Brand as the input.
		 */
		
		//String brandId = requestData.getBrandId();
		
		//factoryIF = factoryIF.getInstance(brandId);
		
		PersistenceResponse persistenceResponse = saveServiceRequestInfo(requestData);
		
		/**
		 * Convert Persistence Layer response to Request level response
		 * 
		 */
		
		Response responseRef = new Response();
		
		return responseRef;
	}
	
	private PersistenceResponse saveServiceRequestInfo(ServiceRequest requestData)
	{
		PersistenceResponse persistenceResponse = null;
		
		/**
		 * Save the object in Database
		 */
		
		return persistenceResponse;
	}

	@Override
	public void onboardItem(String orderItemId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void raiseDemoRequest(String orderItemId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void raiseInstallationRequest(String orderItemId) {
		// TODO Auto-generated method stub
		
	}
	
	

}
