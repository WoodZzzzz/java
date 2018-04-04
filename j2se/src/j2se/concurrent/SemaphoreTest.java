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
				System.out.println("����" + name + "��ʼʹ�û�������");
				Thread.sleep(1000); // ģ�⹤�˹�������ʱ��
				System.out.println("����" + name + "��ɣ��ͷŻ���");
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
