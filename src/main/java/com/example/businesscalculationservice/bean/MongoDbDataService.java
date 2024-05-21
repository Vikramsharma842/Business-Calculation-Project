package com.example.businesscalculationservice.bean;

import org.springframework.stereotype.Component;

import com.example.businesscalculationservice.inter.DataService;

@Component
//@Primary
public class MongoDbDataService implements DataService {

	@Override
	public int[] retrieveData() {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		return arr;
	}

}
