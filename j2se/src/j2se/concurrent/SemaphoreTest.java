package j2se.concurrent;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {

	public static class Worker extends Thread {
		private String name;
		private Semaphore s;

		public Worker(String name, Semaphore s) {
			this.name = name;
			this.s = s;
		}

		public void run() {
			try {
				s.acquire(5);
				System.out.println("工人" + name + "开始使用机器工作");
				Thread.sleep(1000); // 模拟工人工作消耗时间
				System.out.println("工人" + name + "完成，释放机器");
				s.release();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Semaphore s = new Semaphore(5);
		for (int i = 0; i < 10; i++) {
			new Worker("worker" + (i + 1), s).start();
		}
	}
}
