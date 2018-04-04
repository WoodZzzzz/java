package j2se.concurrent.proAndcon;

import java.util.concurrent.CopyOnWriteArrayList;

public class Test {

	private static int count = 0;

	public static class Producer implements Runnable {

		private Object obj;

		public Producer(Object obj) {
			this.obj = obj;
		}

		public void run() {
			while (true) {
				synchronized (obj) {
					count++;
					System.out.println("开始生产" + count);
					if (count >= 10) {
						try {
							Thread.sleep(1000);
							obj.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		}
	}

	public static class Consumer implements Runnable {

		private Object obj;

		public Consumer(Object obj) {
			this.obj = obj;
		}

		public void run() {
			while (true) {
				synchronized (obj) {
					count--;
					System.out.println("开始消费，还剩" + count);
					if (count <= 0) {
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						obj.notifyAll();
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Object obj = new Object();
		Producer p = new Producer(obj);
		Consumer c = new Consumer(obj);
		Thread t = new Thread(p);
		Thread t2 = new Thread(c);
		t.start();
		t2.start();
	}
}
