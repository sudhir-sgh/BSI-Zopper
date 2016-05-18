package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan(basePackages={"com.journaldev.spring","com.journaldev.spring.dao","com.journaldev.spring.di.configuration","com.journaldev.spring.di.consumer",
		"com.journaldev.spring.di.consumer","com.journaldev.spring.di.services","com.journaldev.spring.model","com.journaldev.spring.service","com.websystique.springmvc.domain"})
@ImportResource("classpath:hibernate-bean-config.xml")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
