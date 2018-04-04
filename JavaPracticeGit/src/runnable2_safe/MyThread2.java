package runnable2_safe;

public class MyThread2 extends Thread {
	
	private int count = 5;
	
	public synchronized void run() {
		count--;
		System.out.println("”…" + this.currentThread().getName() + "º∆À„£¨count=" + count);
	}

}
