package j2se.concurrent.print;

public class ABCTest {

	private static int i = 0;

	public static class ThreadA extends Thread {

		private Object a;
		private Object b;

		public ThreadA(Object a, Object b) {
			this.a = a;
			this.b = b;
		}

		public void run() {
			while (true) {
				synchronized (a) {
					synchronized (b) {
						if (i % 3 == 0) {
							System.out.println("A");
							i++;
						}
						b.notify();
					}
					try {
						a.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	public static class ThreadB extends Thread {
		private Object b;
		private Object c;

		public ThreadB(Object b, Object c) {
			this.b = b;
			this.c = c;
		}

		public void run() {
			while (true) {
				synchronized (b) {
					synchronized (c) {
						if (i % 3 == 1) {
							System.out.println("B");
							i++;
						}
						c.notify();
					}
					try {
						b.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	public static class ThreadC extends Thread {
		private Object c;
		private Object a;

		public ThreadC(Object c, Object a) {
			this.c = c;
			this.a = a;
		}

		public void run() {
			while (true) {
				synchronized (c) {
					synchronized (a) {
						if (i % 3 == 2) {
							System.out.println("C");
							i++;
							a.notify();
						}
					}
					try {
						c.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Object a = new Object();
		Object b = new Object();
		Object c = new Object();
		ThreadA ta = new ThreadA(a, b);
		ThreadB tb = new ThreadB(b, c);
		ThreadC tc = new ThreadC(c, a);
		ta.start();
		tb.start();
		tc.start();
	}
}
