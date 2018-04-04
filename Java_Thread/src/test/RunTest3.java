package test;

import extthread.MyThread3;

public class RunTest3 {

	public static void main(String[] args) {
		MyThread3 my = new MyThread3();
		System.out.println("begin =" + System.currentTimeMillis());
		my.run();
		System.out.println("end = " + System.currentTimeMillis());
		
		System.out.println("begin2 =" + System.currentTimeMillis());
		my.start();
		System.out.println("end2 = " + System.currentTimeMillis());
	}

}
