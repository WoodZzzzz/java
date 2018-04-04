package thread.chapter4.s1.section16;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class OrderedPrintByLock {

	private static int currentPrintIndex = 1;
	private static int count = 2; // 为什么不写0，原因是condition.await()方法是等待被唤醒之后是直接执行await后面的语句的，要排除两个等待的线程

	private static final ReentrantLock lock = new ReentrantLock();
	private static final Condition conditionA = lock.newCondition();
	private static final Condition conditionB = lock.newCondition();
	private static final Condition conditionC = lock.newCondition();

	public static void main(String[] args) {
		Thread a = new Thread() {
			public void run() {
				try {
					lock.lock();
					while (count < 30) {
						while (currentPrintIndex != 1) {
							conditionA.await();
						}
						currentPrintIndex = 2;
						System.out.println("1" + "---" + count);
						count++;
						conditionB.signalAll();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					lock.unlock();
				}
			}
		};

		Thread b = new Thread() {
			public void run() {
				try {
					lock.lock();
					while (count < 30) {
						while (currentPrintIndex != 2) {
							conditionB.await();
						}
						currentPrintIndex = 3;
						System.out.println("2" + "---" + count);
						count++;
						conditionC.signalAll();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					lock.unlock();
				}
			}
		};

		Thread c = new Thread() {
			public void run() {
				try {
					lock.lock();
					while (count < 30) {
						while (currentPrintIndex != 3) {
							conditionC.await();
						}
						currentPrintIndex = 1;
						System.out.println("3" + "---" + count);
						count++;
						conditionA.signalAll();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					lock.unlock();
				}
			}
		};

		/*
		 * Thread[] aArray = new Thread[10]; Thread[] bArray = new Thread[10];
		 * Thread[] cArray = new Thread[10];
		 * 
		 * for (int i = 0; i < 10; i++) { aArray[i] = new Thread(a); bArray[i] =
		 * new Thread(b); cArray[i] = new Thread(c); aArray[i].start();
		 * bArray[i].start(); cArray[i].start(); }
		 */
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		Thread t3 = new Thread(c);
		t1.start();
		t2.start();
		t3.start();
	}
}
