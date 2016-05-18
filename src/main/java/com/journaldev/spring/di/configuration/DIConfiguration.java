package com.journaldev.spring.di.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.journaldev.spring.di.services.EmailService;
import com.journaldev.spring.di.services.MessageService;

@Configuration
// Either of the below option will run the component scans
//@ComponentScan(value={"com.journaldev.spring.di.consumer"})
@ComponentScan(basePackages={"com.journaldev.spring.dao","com.journaldev.spring.di.configuration","com.journaldev.spring.di.consumer",
		"com.journaldev.spring.di.consumer","com.journaldev.spring.di.services","com.journaldev.spring.model","com.journaldev.spring.service","com.websystique.springmvc.domain"})
@ImportResource("classpath:hibernate-bean-config.xml")
//@ComponentScan(basePackageClasses={com.journaldev.spring.di.consumer.MyApplication.class})
public class DIConfiguration {

	@Bean
	public MessageService getMessageService(){
		return new EmailService();
	}
}
