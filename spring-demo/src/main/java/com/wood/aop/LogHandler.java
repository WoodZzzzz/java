package com.wood.aop;

public class LogHandler {

	public void logBefore() {
		System.out.println("打印日志之前");
	}
	
	public void logAfter() {
		System.out.println("打印日志之后");
	}
}
