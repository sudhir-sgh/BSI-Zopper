package com.zopper.servicemanager.core.interfaces;

import com.zopper.servicemanager.core.pojo.Response;
import com.zopper.servicemanager.core.pojo.ServiceRequest;

public interface ServiceRequestRetrievalIF {
	
	public ServiceRequest getServiceRequestInfo(String orderItemId);
	
	public Response createNewServiceRequest(ServiceRequest incomingReqData);
	
	public void onboardItem(String orderItemId);
	
	public void raiseDemoRequest(String orderItemId);
	
	public void raiseInstallationRequest(String orderItemId);

}
