package com.example.businesscalculationservice.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.businesscalculationservice.inter.DataService;

@Component
@Primary
public class MySQLDataService implements DataService {

	@Override
	public int[] retrieveData() {
		int[] arr = { 332, 23423, 6354 };
		return arr;
	}
}
