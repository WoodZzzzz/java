package j2se.concurrent.print;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ABCTest2 {

	static ReentrantLock lock = new ReentrantLock();
	private static int i = 0;
	static Condition con1 = lock.newCondition();
	static Condition con2 = lock.newCondition();
	static Condition con3 = lock.newCondition();

	public static class ThreadA extends Thread {

		public void run() {
			while (true) {
				try {
					lock.lock();
					if (i % 3 == 0) {
						System.out.println("A");
						i++;
						con2.signal();
					}
					con1.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					lock.unlock();
				}
			}
		}
	}

	public static class ThreadB extends Thread {

		public void run() {
			while (true) {
				try {
					lock.lock();
					if (i % 3 == 1) {
						System.out.println("B");
						i++;
						con3.signal();
					}
					con2.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					lock.unlock();
				}
			}
		}
	}

	public static class ThreadC extends Thread {

		public void run() {
			while (true) {
				try {
					lock.lock();
					if (i % 3 == 2) {
						System.out.println("C");
						i++;
						con1.signal();
					}
					con3.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					lock.unlock();
				}
			}
		}
	}

	public static void main(String[] args) {
		ThreadA ta = new ThreadA();
		ThreadB tb = new ThreadB();
		ThreadC tc = new ThreadC();
		ta.start();
		tb.start();
		tc.start();
	}
}
