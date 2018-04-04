package thread.chapter3.s1.section8;

public class MyRunnable {

	private static Object obj = new Object();

	private static Runnable runable = new Runnable() {

		public void run() {
			try {
				synchronized (obj) {
					System.out.println("wait begin "
							+ System.currentTimeMillis());
					obj.wait(5000);
					System.out
							.println("wait end " + System.currentTimeMillis());
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};

	private static Runnable runable2 = new Runnable() {
		public void run() {
			synchronized (obj) {
				System.out
						.println("notify begin " + System.currentTimeMillis());
				obj.notify();
				System.out.println("notify end " + System.currentTimeMillis());
			}
		}
	};

	public static void main(String[] args) {
		try {
			Thread t = new Thread(runable);
			t.start(); // ����֮���Զ�����
			Thread.sleep(3000);
			Thread t2 = new Thread(runable2);
			t2.start(); //Ҳ�����������߳�������
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
