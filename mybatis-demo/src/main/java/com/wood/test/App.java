package com.wood.test;

public class App {

	private int i = 0;
	
	public synchronized void add() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i = 1;
		while (true) {
			System.out.println("g");
		}
	}
	
	Thread t1 = new Thread(new Runnable() {
		public void run() {
			add();
		}
	});
	
	Thread t2 = new Thread(new Runnable() {
		public void run() {
			while (i == 1) {
				System.out.println("k");
			}
		}
	});
	
	public static void main(String[] args) {
		App app = new App();
		app.t1.start();
		app.t2.start();
	}
}
