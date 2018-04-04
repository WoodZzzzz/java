package test;

import thread.MyThread1;

public class Test1 {
	public static void main(String[] args) {
		MyThread1 thread = new MyThread1();
		thread.setName("myThread1");
		thread.start();
		for (int i = 0; i < 10; i++){
			int time = (int)(Math.random() * 1000);
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("main=" + Thread.currentThread().getName());
		}
	}
}
