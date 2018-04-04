package thread.chapter3.s2.section5;

public class ThreadA extends Thread {

	private ThreadB b;

	public ThreadA(ThreadB b) {
		this.b = b;
	}

	public void run() {
		try {
			synchronized (b) {
				b.start();
				Thread.sleep(7000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		ThreadB b = new ThreadB();
		ThreadA a = new ThreadA(b);
		a.start();
		
		Thread.sleep(1000);
		ThreadC c = new ThreadC(b);
		c.start();
	}
}

class ThreadB extends Thread {

	public void run() {
		try {
			System.out.println("b run begin " + System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("b run end   " + System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public synchronized void testMethod() {
		System.out.println("打印了同步方法");
	}
}

class ThreadC extends Thread {
	
	private ThreadB b;
	
	public ThreadC(ThreadB b) {
		this.b = b;
	}
	
	public void run() {
		b.testMethod();
	}
}