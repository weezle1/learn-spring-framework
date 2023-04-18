package com.in28minutes.learnspringframework.examples.c1;

import java.util.Arrays;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service // business logic in class so use @Service
public class BusinessCalculationService {
	private DataService dataService;
	
	public BusinessCalculationService(DataService dataService) {
		super();
		//System.out.println("super.getClass()=" + super.getClass());
		this.dataService = dataService;
	}
	
	public int findMax() {
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}
}
