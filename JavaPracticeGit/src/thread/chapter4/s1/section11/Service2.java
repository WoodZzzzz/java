package thread.chapter4.s1.section11;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service2 {

	public ReentrantLock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	
	public void waitMethod() {
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
	
	public void notifyMethod() {
		try {
			lock.lock();
			System.out.println("有没有线程正在等待condition:" + lock.hasWaiters(condition)
					+ ",线程个数:" + lock.getWaitQueueLength(condition));
			condition.signal();
		} finally {
			lock.unlock();
		}
	}
}
