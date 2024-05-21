package com.example.businesscalculationservice.bean;

import java.util.Arrays;

import org.springframework.stereotype.Component;

import com.example.businesscalculationservice.inter.DataService;

@Component
public class BusinessCalculationService {
	private DataService dataService;

	public BusinessCalculationService(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	public int findMax() {
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}
}
