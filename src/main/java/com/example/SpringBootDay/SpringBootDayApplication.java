package com.example.SpringBootDay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import static org.springframework.boot.SpringApplication.*;

@SpringBootApplication
public class SpringBootDayApplication {

	public static void main(String[] args) {


		ConfigurableAppliccationContext context= run(SpringBootDayApplication.class, args);
		Customers customers=context.getBean(Customers.class);
	}

}
