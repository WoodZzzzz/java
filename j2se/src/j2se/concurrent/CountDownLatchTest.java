package j2se.concurrent;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class CountDownLatchTest {
	
	private static Random sr = new Random(47);
	private static AtomicInteger result = new AtomicInteger(0);
	private static int threadCount = 10;
	private static CountDownLatch countDown = new CountDownLatch(threadCount);
	
	private static class Parser implements Runnable {
		String name;
		public Parser(String name) {
			this.name = name;
		}
		
		public void run() {
			int sum = 0;
		/*	int seed = Math.abs(sr.nextInt());
			Random r = new Random(7);
			for (int i = 0; i < 100; i++) {
				sum += r.nextInt(seed);
			}
			result.addAndGet(sum);*/
			System.out.println(name + "�߳̽��������" + sum);
			
		}
		
		public static void main(String[] args) throws InterruptedException {
			Thread[] threads = new Thread[threadCount];
			for (int i = 0; i < threadCount; i++) {
				threads[i] = new Thread(new Parser("Parser-" + i));
			}
			for (int i = 0; i < threadCount; i++) {
				threads[i].start();
//				Thread.sleep(10);
				countDown.countDown();
			}
			countDown.await();
			System.out.println("�����߳̽������");
			System.out.println("�������Ϊ" + result);
		}
	}
	
}
