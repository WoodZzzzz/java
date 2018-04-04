package j2se.concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest2 {

	public static void main(String[] args) {
		final CyclicBarrier barrier = new CyclicBarrier(10);
		for (int i = 0; i < 11; i++) {
			new Thread(new Runnable() {
				public void run() {
					System.out.println(Thread.currentThread());
					try {
						barrier.await();
					} catch (InterruptedException e) {
						e.printStackTrace();
					} catch (BrokenBarrierException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread() + "¿ªÊ¼Ö´ÐÐ");
				}
			}).start();
		}
		System.out.println("main");

	}
}
