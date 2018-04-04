package demo24;

import java.util.PriorityQueue;

public class Test3 {

	private int queueSize = 10;
	private PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

	public static void main(String[] args) {
		Test3 test3 = new Test3();
		Consumer consumer = test3.new Consumer();
		Producer producer = test3.new Producer();
		consumer.start();
		producer.start();
	}

	class Consumer extends Thread {

		public void run() {
			consume();
		}

		private void consume() {
			while (true) {
				synchronized (queue) {
					while (queue.size() == 0) {
						try {
							Thread.sleep(1000);
							System.out.println("队列为空，等待入库");
							queue.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							queue.notify();
						}
					}
					queue.poll();
					queue.notify();
					System.out.println("从队列中取走元素，剩余" + queue.size() + "个元素");
				}
			}
		}
	}

	class Producer extends Thread {

		public void run() {
			produce();
		}

		private void produce() {
			while (true) {
				synchronized (queue) {
					while (queue.size() == queueSize) {
						try {
							Thread.sleep(1000);
							System.out.println("队列已满，等待出库");
							queue.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							queue.notify();
						}
					}
					queue.offer(1);
					queue.notify();
					System.out.println("向队列中插入元素，剩余空间为" + (queueSize - queue.size()));
				}
			}
		}
	}

}
