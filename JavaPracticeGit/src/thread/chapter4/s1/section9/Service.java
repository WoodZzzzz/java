package thread.chapter4.s1.section9;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Service {

	private Lock lock;

	public Service(boolean fair) {
		lock = new ReentrantLock(fair);
	}

	public void testFair() {
		try {
			lock.lock();
			System.out.println(Thread.currentThread().getName() + "ªÒµ√À¯¡À");
		} finally {
			lock.unlock();
		}
	}
}
