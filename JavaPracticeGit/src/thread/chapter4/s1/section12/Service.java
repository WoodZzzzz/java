package thread.chapter4.s1.section12;

import java.util.concurrent.locks.ReentrantLock;

public class Service {

	private ReentrantLock lock;

	public Service(boolean fair) {
		lock = new ReentrantLock(fair);
	}

	public void serviceMethod() {
		try {
			System.out.println(Thread.currentThread().getName() + "当前线程是否保持锁定"
					+ lock.isHeldByCurrentThread());
			System.out.println(Thread.currentThread().getName()
					+ "当前线程是否由任意线程保持锁定" + lock.isLocked());
			lock.lock();
			System.out.println(Thread.currentThread().getName() + "当前锁是否为公平锁"
					+ lock.isFair());
			System.out.println(Thread.currentThread().getName() + "当前线程是否保持锁定"
					+ lock.isHeldByCurrentThread());
			System.out.println(Thread.currentThread().getName()
					+ "当前线程是否由任意线程保持锁定" + lock.isLocked());
		} finally {
			lock.unlock();
		}
	}
}
