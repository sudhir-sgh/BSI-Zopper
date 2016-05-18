package com.zopper.servicemanager.core.persistence.interfaces;

import java.util.List;

import com.zopper.servicemanager.core.pojo.PersistenceResponse;
import com.zopper.servicemanager.core.pojo.ServiceRequest;

public interface ServiceRequestPersistenceManagerFactoryIF {
	
	public ServiceRequest getServiceRequestInfo(String serviceJobId);
	
	public List<ServiceRequest> getListServiceRequestInfo(List<String> serviceJobIdList);
	
	public PersistenceResponse createNewServiceRequest(ServiceRequest incomingReqData);
	
	public ServiceRequestPersistenceManagerFactoryIF getInstance(String brandId);

}
