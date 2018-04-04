package test;

import extthread.MyThread;

public class MyThreadTest1 {

	public static void main(String[] args) {
		MyThread my = new MyThread();
		Thread t1 = new Thread(my);
		Thread t2 = new Thread(my);
		Thread t3 = new Thread(my);
		Thread t4 = new Thread(my);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
