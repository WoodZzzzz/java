package thread.chapter4.s1.section5;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();

	public void awaitA() {
		try {
			lock.lock();
			System.out.println("awaitA方法，线程" + Thread.currentThread().getName()
					+ "已进入等待");
			condition.await();
			System.out.println("awaitA方法，线程" + Thread.currentThread().getName()
					+ "已被唤醒");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void awaitB() {
		try {
			lock.lock();
			System.out.println("awaitB方法，线程" + Thread.currentThread().getName()
					+ "已进入等待");
			condition.await();
			System.out.println("awaitB方法，线程" + Thread.currentThread().getName()
					+ "已被唤醒");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void signalAll() {
		try {
			lock.lock();
			System.out.println("唤醒全部，线程" + Thread.currentThread().getName());
			condition.signalAll();
		} finally {
			lock.unlock();
		}
	}
}
