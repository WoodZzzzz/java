package thread.chapter3.s1.section3;

public class MyThread2 extends Thread {

	private Object lock;

	public MyThread2(Object lock) {
		this.lock = lock;
	}

	public void run() {
		synchronized (lock) {
			System.out.println("¿ªÊ¼notify" + System.currentTimeMillis());
			lock.notify();
			System.out.println("½áÊønotify" + System.currentTimeMillis());
		}
	}
}
