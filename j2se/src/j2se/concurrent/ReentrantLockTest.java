package j2se.concurrent;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 * @����: ������������ģ�� 
 * @����: zwj
 * @��������: 2018��3��8�� ����12:24:30
 * @����: @ReentrantLockTest
 */
public class ReentrantLockTest {

	private Lock lock = new ReentrantLock();
	private Condition condition1 = lock.newCondition();
	private Condition condition2 = lock.newCondition();

	private boolean hasValue = false;

	public void produce() {
		try {
			lock.lock();
			while (hasValue)
				condition1.await();
			System.out.println("�����߿�ʼ����");
			hasValue = true;
			condition2.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void consume() {
		try {
			lock.lock();
			while (!hasValue)
				condition2.await();
			System.out.println("�����߿�ʼ����");
			hasValue = false;
			condition1.signal();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public static class ThreadA extends Thread {

		private ReentrantLockTest r;

		public ThreadA(ReentrantLockTest r) {
			this.r = r;
		}

		public void run() {
			while (true)
				r.produce();
		}
	}

	public static class ThreadB extends Thread {

		private ReentrantLockTest r = null;

		public ThreadB(ReentrantLockTest r) {
			this.r = r;
		}

		public void run() {
			while (true)
				r.consume();
		}
	}

	public static void main(String[] args) {
		ReentrantLockTest r = new ReentrantLockTest();
		ThreadA a = new ThreadA(r);
		ThreadB b = new ThreadB(r);
		Thread t = new Thread(a);
		Thread t2 = new Thread(b);
		t.start();
		t2.start();

	}

}
