package j2se.test;

/**
 * 循环打印ABC，线程之间执行时间是不确定的，所以才可以采用锁来限制各个线程执行顺序，定义三个对象作为控制三个线程顺序 A线程持有a对象、锁住b和c，
 * 当A执行完毕之后给a对象的加锁、释放b对象锁； 由于B线程持有b对象锁，执行完毕之后给b对象加锁，释放c对象锁。依次类推
 */
public class CyclicPrintTest {

	static int i = 0;

	public static class ThreadA extends Thread {

		private Object a;
		private Object b;
		String name;

		public ThreadA(Object a, Object b, String name) {
			this.a = a;
			this.b = b;
			this.name = name;
		}

		public void run() {
			while (true) {
				synchronized (a) {
					try {
						synchronized (b) {
							if (i % 3 == 0) {
								System.out.println(name);
								b.notify();
								i++;
							}
						}
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
		String name;

		public ThreadB(Object b, Object c, String name) {
			this.b = b;
			this.c = c;
			this.name = name;
		}

		public void run() {
			while (true) {
				synchronized (b) {
					try {
						synchronized (c) {
							if (i % 3 == 1) {
								System.out.println(name);
								i++;
								c.notify();
							}
						}
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
		String name;

		public ThreadC(Object c, Object a, String name) {
			this.c = c;
			this.a = a;
			this.name = name;
		}

		public void run() {
			while (true) {
				synchronized (c) {
					try {
						synchronized (a) {
							if (i % 3 == 2) {
								System.out.println(name);
								i++;
								a.notify();
							}
						}
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
		ThreadA ta = new ThreadA(a, b, "A");
		ThreadB tb = new ThreadB(b, c, "B");
		ThreadC tc = new ThreadC(c, a, "C");
		Thread t = new Thread(ta);
		Thread t2 = new Thread(tb);
		Thread t3 = new Thread(tc);
		t.start();
		t2.start();
		t3.start();

	}

}
