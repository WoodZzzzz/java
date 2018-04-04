package com.wood.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class Test {

	public static void main(String[] args) {
//		personTest();
		emptyTest();
//		familyTest();
//		collectionTest();
//		singletonTest();
//		emptyInit();
	}
	
	public static void personTest() {
		String[] arrs = {"bean.xml"};
		ApplicationContext ctx = new ClassPathXmlApplicationContext(arrs);
		Person p1 = (Person) ctx.getBean("person");
		Person p2 = (Person) ctx.getBean("person");
		System.out.println(p1 == p2);
		System.out.println(p1.getPersonName() + p1.getPersonAge());
	}
	
	public static void emptyTest() {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		System.out.println("配置文件加载完成");
		EmptyClass ec = (EmptyClass) ctx.getBean("emptyClass");
		ctx.registerShutdownHook();
		
	}
	
	public static void familyTest() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		System.out.println("�����������ļ�");
		Family f = (Family) ctx.getBean("family");
		System.out.println(f);
	}
	
	public static void collectionTest() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		System.out.println("�����������ļ�");
		CollectionClass c = (CollectionClass) ctx.getBean("collectionClass");
		System.out.println(c.getList());
		System.out.println(c.getMap());
		System.out.println(c.getInts()[0]);
	}
	
	public static void singletonTest() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		SingletonClass single = (SingletonClass) ctx.getBean("singletonClass");
		SingletonClass single2 = (SingletonClass) ctx.getBean("singletonClass");
		//factory-method="getInstance"
		System.out.println(single == single2);
	}
	
	public static void emptyInit() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		EmptyClass e = (EmptyClass) ctx.getBean("empty");
		((ClassPathXmlApplicationContext)ctx).close();
		System.out.println(e);
	}
}
