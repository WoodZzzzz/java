package thread.chapter4.s1.section4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
//	private Condition condition2 = lock.newCondition();
	
	public void await() {
		try {
			lock.lock();
			System.out.println(" await 时间开始于" + System.currentTimeMillis());
			condition.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void signal() {
		try {
			lock.lock();    
			System.out.println(" signal 时间开始于" + System.currentTimeMillis());
//			condition2.signal(); // 相当于notify
			condition.signal(); // 相当于notify
		} finally {
			lock.unlock();
		}
	}
}
