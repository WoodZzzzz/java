package j2se.concurrent;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 * @����:���������
 * @����: zwj
 * @��������: 2018��3��13�� ����6:33:33
 * @����: @ReentrantLockTest3
 */
public class ReentrantLockTest3 {

	public static class Test implements Runnable  {
		
		ReentrantLock lock = new ReentrantLock();
		
		public void a() {
			lock.lock();
			System.out.println(Thread.currentThread() + "����a����");
			b();
			lock.unlock();
			System.out.println("a����ִ�����");
		}
		
		public void b() {
			lock.lock();
			System.out.println(Thread.currentThread() + "����b����");
			lock.unlock();
			System.out.println("b����ִ�����");
		}
		
		public void c() {
			
		}
		
		public void run() {
//			a();
		}
		
	}
	
	public static void main(String[] args) {
		new Thread(new Test()).start();
		
		
	}
}
