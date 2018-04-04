package j2se.concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;

public class AutomicDemo {
	static AtomicInteger i = new AtomicInteger(0);
	static AtomicBetter ab = new AtomicBetter();
	static CountDownLatch c = new CountDownLatch(4);
	
	public static void main(String[] args) throws InterruptedException,
			BrokenBarrierException {
		long start = System.currentTimeMillis();
		for (int m = 0; m < 4; m++) {
			Thread t = new Thread(new Runnable() {
				@Override
				public void run() {
					for (int p = 0; p < 40000000; p++) {
//						i.incrementAndGet();
						ab.increaseAndGet();
//						System.out.println("i£º" + i.get());
					}
					c.countDown();
				}
			});
			t.start();
		}
		c.await();
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
	
	public static class AtomicBetter {
		
		AtomicInteger a = new AtomicInteger();
		
		public int increaseAndGet() {
			
			for (;;) {
				int current = a.get();
				int next = current + 1;
				if (compareAndSet(current, next)) {
					return next;
				}
			}
		}

		private boolean compareAndSet(int current, int next) {
			if (a.compareAndSet(current, next)) {
				return true;
			} else {
				LockSupport.parkNanos(1);
				return false;
			}
		}
	}
}