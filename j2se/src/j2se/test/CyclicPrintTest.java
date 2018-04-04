package j2se.test;

/**
 * ѭ����ӡABC���߳�֮��ִ��ʱ���ǲ�ȷ���ģ����Բſ��Բ����������Ƹ����߳�ִ��˳�򣬶�������������Ϊ���������߳�˳�� A�̳߳���a������סb��c��
 * ��Aִ�����֮���a����ļ������ͷ�b�������� ����B�̳߳���b��������ִ�����֮���b����������ͷ�c����������������
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
