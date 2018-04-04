package thread.chapter4.s1.section13;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class MyService2 {

	public ReentrantLock lock = new ReentrantLock();

	public void waitMethod() {
		if (lock.tryLock()) {
			System.out.println(Thread.currentThread().getName()
					+ "获得锁         " + System.currentTimeMillis());
		} else {
			System.out.println(Thread.currentThread().getName() + "没有获得锁"
					+ System.currentTimeMillis());
		}
	}
}
