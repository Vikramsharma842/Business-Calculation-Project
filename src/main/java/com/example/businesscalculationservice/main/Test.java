package com.example.businesscalculationservice.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.businesscalculationservice.bean.BusinessCalculationService;
import com.example.businesscalculationservice.resource.SpringConfigFile;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

		int ds = context.getBean(BusinessCalculationService.class).findMax();
		System.out.println(ds);
	}

}
