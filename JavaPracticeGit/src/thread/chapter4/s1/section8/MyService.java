package thread.chapter4.s1.section8;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	private boolean hasValue = false;

	public void use() {
		try {
			lock.lock();
			while (hasValue == false) {
				System.out.println(Thread.currentThread().getName()
						+ "正在等待☆");
				condition.await();
			}
			System.out.println("☆" + Thread.currentThread().getName());
			hasValue = false;
			condition.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void set() {
		try {
			lock.lock();
			while (hasValue) {
				System.out.println(Thread.currentThread().getName()
						+ "正在等待★");
				condition.await();
			}
			System.out.println("★" + Thread.currentThread().getName());
			hasValue = true;
			condition.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}

	}
}
