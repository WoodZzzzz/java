
package j2se.concurrent;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 * @描述: 循环输出ABC
 * @作者: zwj
 * @创建日期: 2018年3月8日 下午12:24:15
 * @参数: @ReentrantLockTest2
 */
public class ReentrantLockTest2 {

	private Lock lock = new ReentrantLock();

	private Condition cond1 = lock.newCondition();
	private Condition cond2 = lock.newCondition();
	private Condition cond3 = lock.newCondition();

	private int count = 0;

	public void a() {
		try {
			lock.lock();
			while (count % 3 == 0) {
				cond1.await();
				System.out.println("AAAA");
				count++;
			}
			cond2.signal();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}

	}

	public void b() {
		try {
			lock.lock();
			while (count % 3 == 1) {
				cond2.await();
				System.out.println("BBBB");
				count++;
			}
			cond3.signal();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void c() {
		try {
			lock.lock();
			while (count % 3 == 2) {
				cond3.await();
				System.out.println("CCCC");
				count++;
			}
			cond1.signal();
		} catch (Exception e) {

		} finally {
			lock.unlock();
		}
	}

	public static class ThreadA extends Thread {

		private ReentrantLockTest2 r;

		public ThreadA(ReentrantLockTest2 r) {
			this.r = r;
		}

		public void run() {
			while (true)
				r.a();
		}
	}

	public static class ThreadB extends Thread {

		private ReentrantLockTest2 r = null;

		public ThreadB(ReentrantLockTest2 r) {
			this.r = r;
		}

		public void run() {
			while (true)
				r.b();
		}
	}

	public static class ThreadC extends Thread {

		private ReentrantLockTest2 r = null;

		public ThreadC(ReentrantLockTest2 r) {
			this.r = r;
		}

		public void run() {
			while (true)
				r.c();
		}
	}

	public static void main(String[] args) {
		ReentrantLockTest2 r = new ReentrantLockTest2();
		ThreadA a = new ThreadA(r);
		ThreadB b = new ThreadB(r);
		ThreadC c = new ThreadC(r);
		Thread t = new Thread(a);
		Thread t2 = new Thread(b);
		Thread t3 = new Thread(c);
		t.start();
		t2.start();
		t3.start();

	}

}
