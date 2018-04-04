package j2se.concurrent.proAndcon;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Semaphore;

public class SemaphoreTest2 {

	static Semaphore isFull = new Semaphore(10);
	static Semaphore se = new Semaphore(1);
	static Semaphore isEmpty = new Semaphore(0);

	static ArrayBlockingQueue queue = new ArrayBlockingQueue(10);

	public static void produce() {
		try {
			isFull.acquire();
			se.acquire();
			queue.offer("增加一个产品");
			System.out.println("生产容量为" + queue.size());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			se.release();
			isEmpty.release();
//			System.out.println("释放了isEmpty");
		}
	}

	public static void consume() {
		try {
			isEmpty.acquire();
			se.acquire();
			queue.poll();
			System.out.println("消费容量为" + queue.size());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			se.release();
			isFull.release();
		}
	}

	public static class Producer extends Thread {

		public void run() {
			while (true)
				produce();
		}
	}

	public static class Consumer extends Thread {
		public void run() {
			while (true)
				consume();
		}
	}

	public static void main(String[] args) {
		Producer p = new Producer();
		Consumer c = new Consumer();
		p.start();
		c.start();
	}

}
