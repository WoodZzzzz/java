package j2se.concurrent.proAndcon;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;

public class SemaphoreTest {

	private List list = new ArrayList();
	int i = 0;
	
	Semaphore isFull = new Semaphore(10); //10个表示满了
	Semaphore se = new Semaphore(1);
	Semaphore isEmpty = new Semaphore(0); //0个表示已经空了，谁也不让进，只能由生产者来释放
	
	public void add() {
		//生产
		try {
			isFull.acquire();
			se.acquire();
			list.add(++i);
			System.out.println("生产," + list.size());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			se.release();
			isEmpty.release();
		}
	}
	
	public void take() {
		try {
			isEmpty.acquire();
			se.acquire();
			list.remove(0);
			System.out.println("消费,还剩" + list.size());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			se.release();
			isFull.release();
		}
	}
	
	
	public static class Consumer implements Runnable {
		
		SemaphoreTest t = new SemaphoreTest();
		
		public Consumer(SemaphoreTest t) {
			this.t = t;
		}
		
		public void run() {
			while (true) {
				t.take();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static class Producer implements Runnable {
		
		SemaphoreTest t = new SemaphoreTest();
		
		public Producer(SemaphoreTest t) {
			this.t = t;
		}
		
		public void run() {
			while (true) {
				t.add();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		SemaphoreTest test = new SemaphoreTest();
		Consumer c = new Consumer(test);
		Producer p = new Producer(test);
		Producer p2 = new Producer(test);
		ExecutorService pool = Executors.newCachedThreadPool();
		pool.execute(p);
		pool.execute(p2);
		pool.execute(c);
	}

	
}
