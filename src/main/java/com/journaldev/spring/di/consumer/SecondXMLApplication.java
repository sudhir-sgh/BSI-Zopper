package com.journaldev.spring.di.consumer;

import com.journaldev.spring.di.services.MessageService;

public class SecondXMLApplication {

	private MessageService service;

	//constructor-based dependency injection
	public SecondXMLApplication(MessageService svc) {
		this.service = svc;
	}
	
	//setter-based dependency injection
	public void setService(MessageService svc){
		this.service=svc;
	}

	public boolean processMessage(String msg, String rec) {
		// some magic like validation, logging etc
		return this.service.sendMessage(msg, rec);
	}
}
