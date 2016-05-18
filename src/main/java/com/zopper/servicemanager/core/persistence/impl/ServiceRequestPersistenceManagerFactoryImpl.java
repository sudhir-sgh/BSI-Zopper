package com.zopper.servicemanager.core.persistence.impl;

import java.util.List;

import com.zopper.servicemanager.core.persistence.interfaces.ServiceRequestPersistenceManagerFactoryIF;
import com.zopper.servicemanager.core.pojo.PersistenceResponse;
import com.zopper.servicemanager.core.pojo.ServiceRequest;

public class ServiceRequestPersistenceManagerFactoryImpl implements ServiceRequestPersistenceManagerFactoryIF {

	// Get the correct Instance injected
	ServiceRequestPersistenceManagerFactoryIF persistenceRef = null;
	
	@Override
	public ServiceRequest getServiceRequestInfo(String serviceJobId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ServiceRequest> getListServiceRequestInfo(List<String> serviceJobIdList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersistenceResponse createNewServiceRequest(ServiceRequest incomingReqData) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServiceRequestPersistenceManagerFactoryIF getInstance(String brandId) {
		// TODO Auto-generated method stub
		
		/**
		 * Handle the brandId to initialize and return the correct brand specific instance
		 */
		return null;
	}
	

}
