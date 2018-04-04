package thread.chapter4.s1.section5;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();

	public void awaitA() {
		try {
			lock.lock();
			System.out.println("awaitA�������߳�" + Thread.currentThread().getName()
					+ "�ѽ���ȴ�");
			condition.await();
			System.out.println("awaitA�������߳�" + Thread.currentThread().getName()
					+ "�ѱ�����");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void awaitB() {
		try {
			lock.lock();
			System.out.println("awaitB�������߳�" + Thread.currentThread().getName()
					+ "�ѽ���ȴ�");
			condition.await();
			System.out.println("awaitB�������߳�" + Thread.currentThread().getName()
					+ "�ѱ�����");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void signalAll() {
		try {
			lock.lock();
			System.out.println("����ȫ�����߳�" + Thread.currentThread().getName());
			condition.signalAll();
		} finally {
			lock.unlock();
		}
	}
}
