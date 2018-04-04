package com.wood.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("jdbc.xml");
		System.out.println(StudentManager.getInstance());
		System.out.println(StudentManager.getInstance().getJdbcTemplate());
		System.out.println(StudentManager.getInstance().getStudents());
	}
}
