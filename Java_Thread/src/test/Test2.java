package test;

import thread.MyThread2;

public class Test2 {

	public static void main(String[] args) {
		MyThread2 t1 = new MyThread2(1);
		MyThread2 t2 = new MyThread2(2);
		MyThread2 t3 = new MyThread2(3);
		MyThread2 t4 = new MyThread2(4);
		MyThread2 t5 = new MyThread2(5);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
