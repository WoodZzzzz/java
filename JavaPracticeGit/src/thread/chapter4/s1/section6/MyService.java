package thread.chapter4.s1.section6;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

	private Lock lock = new ReentrantLock();
	private Condition conditionA = lock.newCondition();
	private Condition conditionB = lock.newCondition();

	public void awaitA() {
		try {
			lock.lock();
			System.out.println("awaitA " + Thread.currentThread().getName()
					+ "已进入等待");
			conditionA.await();
			System.out.println("awaitA " + Thread.currentThread().getName()
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
			System.out.println("awaitB " + Thread.currentThread().getName()
					+ "已进入等待");
			conditionB.await();
			System.out.println("awaitB " + Thread.currentThread().getName()
					+ "已被唤醒");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void signalAllOfA() {
		try {
			lock.lock();
			conditionA.signalAll();
		} finally {
			lock.unlock();
		}
	}

	public void signalAllOfB() {
		try {
			lock.lock();
			conditionB.signalAll();
		} finally {
			lock.unlock();
		}
	}
}
