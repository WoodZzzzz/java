package thread.chapter4.s2.section1;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {

	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

	public void readMethod() {
		try {
			lock.readLock().lock();
			System.out.println("获取读锁" + Thread.currentThread().getName() + "--"
					+ System.currentTimeMillis());
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.readLock().unlock();
		}
	}
	
	public void writeMethod() {
		try {
			lock.writeLock().lock();
			System.out.println("获得写锁" + Thread.currentThread().getName() + "--"
					+ System.currentTimeMillis());
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.writeLock().unlock();
		}
	}
}
