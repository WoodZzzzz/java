package thread.chapter3.s1.section3;

public class MyThread1 extends Thread {

	private Object lock;

	public MyThread1(Object lock) {
		this.lock = lock;
	}

	public void run() {
		try {
			synchronized (lock) {
				System.out.println("¿ªÊ¼wait " + System.currentTimeMillis());
				lock.wait();
				System.out.println("½áÊøwait " + System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
