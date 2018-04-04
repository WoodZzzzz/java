package test;

import thread.MyThread3;

public class Test3 {

	public static void main(String[] args) {
		MyThread3 t1 = new MyThread3("A");
		MyThread3 t2 = new MyThread3("B");
		MyThread3 t3 = new MyThread3("C");
		t1.start();
		t2.start();
		t3.start();
	}

}
