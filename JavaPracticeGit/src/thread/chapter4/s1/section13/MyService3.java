package thread.chapter4.s1.section13;

import java.util.concurrent.locks.ReentrantLock;

import java.util.concurrent.TimeUnit;

public class MyService3 {

	public ReentrantLock lock = new ReentrantLock();
	
	public void waitMethod() {
		try {
			System.out.println("��ǰʱ��" + System.currentTimeMillis());
			if (lock.tryLock(2, TimeUnit.SECONDS)) {
				System.out.println("	" + Thread.currentThread().getName()
						+ "�������ʱ��:" + System.currentTimeMillis());
				Thread.sleep(10000);
			} else {
				System.out.println("    " + Thread.currentThread().getName()
						+ "û�����ʱ��" + System.currentTimeMillis() + "");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (lock.isHeldByCurrentThread()) {
				lock.unlock();
			}
		}
	}
}
