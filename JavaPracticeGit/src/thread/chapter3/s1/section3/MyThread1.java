package thread.chapter3.s1.section3;

public class MyThread1 extends Thread {

	private Object lock;

	public MyThread1(Object lock) {
		this.lock = lock;
	}

	public void run() {
		try {
			synchronized (lock) {
				System.out.println("��ʼwait " + System.currentTimeMillis());
				lock.wait();
				System.out.println("����wait " + System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
