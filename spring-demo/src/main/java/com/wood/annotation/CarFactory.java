package com.wood.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class CarFactory {

	@Autowired
	@Qualifier("benz")
	private Car car;
	
	public Test t;
	
	public String toString() {
		return car.getName();
	}
}
