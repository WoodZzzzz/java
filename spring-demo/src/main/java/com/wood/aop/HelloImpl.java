package com.wood.aop;

public class HelloImpl implements Hello {

	@Override
	public void printHello() {
		System.out.println("HelloImpl printHello");
	}

	@Override
	public void doPrint() {
		System.out.println("HelloImpl doPrint");
	}

}
