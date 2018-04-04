package thread.chapter4.s1.section2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

	private Lock lock = new ReentrantLock();

	public void methodA() {
		try {
			lock.lock();
			System.out.println("thread " + Thread.currentThread().getName()
					+ " methodA " + System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("thread " + Thread.currentThread().getName()
					+ " methodA " + System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void methodB() {
		try {
			lock.lock();
			System.out.println("thread " + Thread.currentThread().getName()
					+ " methodB " + System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("thread " + Thread.currentThread().getName()
					+ " methodB " + System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
		
	}
}
