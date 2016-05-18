package com.zopper.servicemanager.brand.interfaces;

public interface BrandHandler {
	
	public void onboardItemForBrand(String orderItemId);
	
	public void raiseDemoRequestForBrand(String orderItemId);
	
	public void raiseInstallationRequestForBrand(String orderItemId);

}
