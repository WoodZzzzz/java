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
			System.out.println("�߳�" + name + "��ʼ����");
			try {
				System.out.println("�߳�" + name + "���ڼ���");
				cyclic.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (BrokenBarrierException e) {
				e.printStackTrace();
			}
			System.out.println(System.currentTimeMillis() + "�����̶߳�ִ�����");
		}
	}

	public static void main(String[] args) {
		// ��ͳ��ʽ���ã�

		CyclicBarrier c = new CyclicBarrier(10);
		Thread[] t = new Thread[10];
		for (int i = 0; i < 10; i++) {
			t[i] = new Thread(new Writer(c, "Thread" + i));
		}
		for (int i = 0; i < 10; i++) {
			t[i].start();
		}

		// �����������м�
		/*final int n = 3;
		CyclicBarrier c = new CyclicBarrier(n, new Runnable() {
			public void run() {
				System.out.println("�̵߳�" + n + "��ʱ�򣬽��ж���Ĳ���");
			}
		});
		for (int i = 0; i < n; i++) {
			new Writer(c, "thread" + i).start();
		}
*/
		System.out.println("ִ�����");
		/*
		 * System.out.println("CyclicBarrier����");
		 * 
		 * for (int i = 0; i < n; i++) { new Writer(c, "thread" + i).start(); }
		 */
	}
}
