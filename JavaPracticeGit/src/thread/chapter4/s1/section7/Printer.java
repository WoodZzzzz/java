package thread.chapter4.s1.section7;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 * @描述: 两个线程交替打印用boolean,因为没有先后顺序,多个线程不建议采用这个方式,因为先后顺序123不好保证 
 * @版权: Copyright (c) 2017  
 * @作者: zwj
 * @创建日期: 2017年10月12日 上午11:35:22
 */
public class Printer {

	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	private boolean printA = true;

	public void printA() {
		try {
			lock.lock();
			while (printA) {
				condition.await();
			}
			System.out.println("☆");
			condition.signal();
			printA = true;
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public void printB() {
		try {
			lock.lock();
			while (printA == false) {
				condition.await();
			}
			System.out.println("★");
			condition.signal();
			printA = false;
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
}
