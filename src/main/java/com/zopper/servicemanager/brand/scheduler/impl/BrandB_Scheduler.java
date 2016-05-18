package com.zopper.servicemanager.brand.scheduler.impl;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class BrandB_Scheduler {
	
	@Scheduled(fixedRate = 10000)
    public void performPeriodicTaskForBrand() {
        System.out.println("Executing periodc task for Brand B !!");
    }

}
