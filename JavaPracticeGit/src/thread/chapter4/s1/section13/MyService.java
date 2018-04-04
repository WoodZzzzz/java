package thread.chapter4.s1.section13;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

	public ReentrantLock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	public void waitMethod() {
		try {
//			lock.lock();
			lock.lockInterruptibly();  //�����ǰ�̱߳��ж�,���׳��쳣
			System.out.println("lock begin " + Thread.currentThread().getName());
			for (int i = 0; i < Integer.MAX_VALUE / 100; i++) {
				Math.random();
			}
			System.out.println("lock end " + Thread.currentThread().getName());
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			if (lock.isHeldByCurrentThread()) {
				lock.unlock();
			}
		}
	}
}
