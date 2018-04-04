package thread.chapter3.s2.section3;

public class ThreadA extends Thread {

	public void run() {
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			String str = new String();
			Math.random();
		}
	}

	public static void main(String[] args) {
		try {
			ThreadB b = new ThreadB();
			b.start();
			
			Thread.sleep(500);
			
			ThreadC c = new ThreadC(b);
			c.start();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class ThreadB extends Thread {

	public void run() {
		try {
			ThreadA a = new ThreadA();
			a.start();
			a.join();
		} catch (InterruptedException e) {
			System.out.println("Òì³£");
			e.printStackTrace();
		}
	}
}

class ThreadC extends Thread {

	private ThreadB b;

	public ThreadC(ThreadB b) {
		this.b = b;
	}

	public void run() {
		b.interrupt();
	}
}