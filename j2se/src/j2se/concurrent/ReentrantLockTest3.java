package j2se.concurrent;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 * @描述:可重入测试
 * @作者: zwj
 * @创建日期: 2018年3月13日 下午6:33:33
 * @参数: @ReentrantLockTest3
 */
public class ReentrantLockTest3 {

	public static class Test implements Runnable  {
		
		ReentrantLock lock = new ReentrantLock();
		
		public void a() {
			lock.lock();
			System.out.println(Thread.currentThread() + "进入a方法");
			b();
			lock.unlock();
			System.out.println("a方法执行完成");
		}
		
		public void b() {
			lock.lock();
			System.out.println(Thread.currentThread() + "进入b方法");
			lock.unlock();
			System.out.println("b方法执行完毕");
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
