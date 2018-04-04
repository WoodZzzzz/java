package thread.chapter4.s1.section12;

import java.util.concurrent.locks.ReentrantLock;

public class Service {

	private ReentrantLock lock;

	public Service(boolean fair) {
		lock = new ReentrantLock(fair);
	}

	public void serviceMethod() {
		try {
			System.out.println(Thread.currentThread().getName() + "��ǰ�߳��Ƿ񱣳�����"
					+ lock.isHeldByCurrentThread());
			System.out.println(Thread.currentThread().getName()
					+ "��ǰ�߳��Ƿ��������̱߳�������" + lock.isLocked());
			lock.lock();
			System.out.println(Thread.currentThread().getName() + "��ǰ���Ƿ�Ϊ��ƽ��"
					+ lock.isFair());
			System.out.println(Thread.currentThread().getName() + "��ǰ�߳��Ƿ񱣳�����"
					+ lock.isHeldByCurrentThread());
			System.out.println(Thread.currentThread().getName()
					+ "��ǰ�߳��Ƿ��������̱߳�������" + lock.isLocked());
		} finally {
			lock.unlock();
		}
	}
}
