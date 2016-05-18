package com.zopper.servicemanager.brand.scheduler.impl;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class BrandA_Scheduler {
	
	@Scheduled(fixedRate = 5000)
    public void performPeriodicTaskForBrand() {
        System.out.println("Executing periodc task for Brand A !!");
    }

}
