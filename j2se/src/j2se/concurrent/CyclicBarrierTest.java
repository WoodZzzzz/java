package j2se.concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {

	public int i = 10;

	private CyclicBarrierTest() {
		i = 3;
	}

	public static class Writer extends Thread implements Runnable {

		private CyclicBarrier cyclic;
		private String name;

		public Writer(CyclicBarrier cyclic, String name) {
			this.cyclic = cyclic;
			this.name = name;
		}

		public void run() {
			System.out.println("线程" + name + "开始进入");
			try {
				System.out.println("线程" + name + "正在计算");
				cyclic.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (BrokenBarrierException e) {
				e.printStackTrace();
			}
			System.out.println(System.currentTimeMillis() + "所有线程都执行完毕");
		}
	}

	public static void main(String[] args) {
		// 传统方式调用，

		CyclicBarrier c = new CyclicBarrier(10);
		Thread[] t = new Thread[10];
		for (int i = 0; i < 10; i++) {
			t[i] = new Thread(new Writer(c, "Thread" + i));
		}
		for (int i = 0; i < 10; i++) {
			t[i].start();
		}

		// 屏障设置在中间
		/*final int n = 3;
		CyclicBarrier c = new CyclicBarrier(n, new Runnable() {
			public void run() {
				System.out.println("线程到" + n + "的时候，进行额外的操作");
			}
		});
		for (int i = 0; i < n; i++) {
			new Writer(c, "thread" + i).start();
		}
*/
		System.out.println("执行完毕");
		/*
		 * System.out.println("CyclicBarrier重用");
		 * 
		 * for (int i = 0; i < n; i++) { new Writer(c, "thread" + i).start(); }
		 */
	}
}
