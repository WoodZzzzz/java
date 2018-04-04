package com.wood.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aop.xml");
		Hello h1 = (Hello) ctx.getBean("hello");
		h1.printHello();
	}
}
