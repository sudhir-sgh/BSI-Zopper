package com.zopper.servicemanager.brand.impl;

import com.zopper.servicemanager.brand.interfaces.BrandHandler;

public class A_BrandHandler implements BrandHandler {

	@Override
	public void onboardItemForBrand(String orderItemId) {
		// TODO Auto-generated method stub
		/**
		 * Brand Specific Logic to handle the new item addition for this brand
		 */

	}

	@Override
	public void raiseDemoRequestForBrand(String orderItemId) {
		// TODO Auto-generated method stub
		/**
		 * Brand Specific Logic to handle the new demo request flow
		 * Flow might consist of steps like sending Email, Push Notifications, 
		 * SMS or even brand specific API call over HTTP 
		 * 
		 * Additionally, there might be a need to get a scheduled task to 
		 * do timely processing for this brand like updating status to CALL brand 
		 * customer support OR like fetching status from brand specific API
		 * 
		 */
	}

	@Override
	public void raiseInstallationRequestForBrand(String orderItemId) {
		// TODO Auto-generated method stub
		/**
		 * Brand Specific Logic to handle the new Installation request flow
		 * Flow might consist of steps like sending Email, Push Notifications, 
		 * SMS or even brand specific API call over HTTP 
		 */

	}

}
