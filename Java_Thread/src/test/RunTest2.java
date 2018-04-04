package test;

import extthread.MyThread2;


public class RunTest2 {

	public static void main(String[] args) {
		MyThread2 my = new MyThread2();
		my.start();
		my.run();
	}

}
