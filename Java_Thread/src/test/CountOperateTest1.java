package test;

import extthread.CountOperate;

public class CountOperateTest1 {

	public static void main(String[] args) {
		/*
		 * Thread main
		 * Thread true
		 * this Thread-0 
		 * this false
		 */
		CountOperate c = new CountOperate(); 
		Thread t1 = new Thread(c);
		System.out.println("main begin t1 isAlive=" + t1.isAlive()); // t1 false
		t1.setName("A");
		/*
		 * Thread A
		 * Thread true
		 * this Thread-0
		 * this false
		 */
		t1.start();
		/*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		System.out.println("main end t1 isAlive=" + t1.isAlive()); // t1 true
		
		
		
		/**
		 * main
		 * true
		 * Thread-0
		 * false
		 * 
		 * main begin t1 isAlive=false
		 * 
		 * A
		 * true
		 * Thread-0
		 * false
		 * true
		 */
	}

}
