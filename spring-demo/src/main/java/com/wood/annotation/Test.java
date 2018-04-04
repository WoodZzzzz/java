package com.wood.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("annotation_test.xml");
		Zoo z = (Zoo) ctx.getBean("zoo");
		System.out.println(z);
//		CarFactory c = (CarFactory) ctx.getBean("carFactory");
//		System.out.println(c.toString());
	}
}
