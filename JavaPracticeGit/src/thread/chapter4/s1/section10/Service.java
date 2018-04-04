package thread.chapter4.s1.section10;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {

	public ReentrantLock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();

	public void testMethod1() {
		try {
			lock.lock();
			System.out.println("testMethod1 getHoldCount="
					+ lock.getHoldCount());
			testMethod2();
		} finally {
			lock.unlock();
		}
	}

	public void testMethod2() {
		try {
			lock.lock();
			System.out.println("testMethod2 getHoldCount="
					+ lock.getHoldCount());
		} finally {
			lock.unlock();
		}
	}

	public void testQueueLength() {
		try {
			lock.lock();
			System.out.println("进入getTestQueueLengthMethod");
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void testAwaitMethod() {
		try {
			lock.lock();
			condition.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void testNotifyMethod() {
		try {
			lock.lock();
			System.out.println("有" + lock.getWaitQueueLength(condition) + "个线程正在等待");
		} finally {
			lock.unlock();
		}
	}
}
