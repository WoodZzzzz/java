package thread.chapter4.s1.section3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();

	public void await() {
		try {
			lock.lock();  //必须加锁, 否则调用await会报 IllegalMonitorStateException
			System.out.println("A");
			condition.await();
			System.out.println("B");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
}
