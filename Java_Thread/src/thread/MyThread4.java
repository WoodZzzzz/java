package thread;

public class MyThread4 extends Thread {
	private int count = 5;
	
	public synchronized void run(){  //synchronized
		super.run();
		count--;
		System.out.println("当前线程: " + this.currentThread().getName() + " count = " + count);
	}
}
