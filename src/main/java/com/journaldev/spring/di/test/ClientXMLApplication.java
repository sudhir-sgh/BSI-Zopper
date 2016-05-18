package com.journaldev.spring.di.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.journaldev.spring.di.consumer.MyXMLApplication;
import com.journaldev.spring.di.consumer.SecondXMLApplication;
import com.journaldev.spring.di.services.TwitterService;

public class ClientXMLApplication {

	public static void main(String[] args) {
		
		System.out.println("Starting New ClientXMLApplication");
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		MyXMLApplication app = context.getBean(MyXMLApplication.class);

		app.processMessage("Hi Pankaj", "pankaj@abc.com");
		
		ClassPathXmlApplicationContext newContext = new ClassPathXmlApplicationContext(
				"second_applicationContext.xml");
		SecondXMLApplication app_1 = (SecondXMLApplication)newContext.getBean("MyXMLApp_1");
		//TwitterService twitterRef = (TwitterService)newContext.getBean("twitter");
		
		//app_1.setService(twitterRef);

		app_1.processMessage("Hi Rahul", "varun@abc.com");

		// close the context
		context.close();
		newContext.close();
	}

}
