package thread.chapter4.s1.section11;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {
	
	public ReentrantLock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	
	public void waitMethod() {
		try {
			lock.lock();
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}
