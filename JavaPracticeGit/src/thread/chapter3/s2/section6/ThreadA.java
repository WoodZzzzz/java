package thread.chapter3.s2.section6;

public class ThreadA extends Thread {

	private ThreadB b;

	public ThreadA(ThreadB b) {
		this.b = b;
	}

	public void run() {
		try {
			synchronized (b) {
				System.out.println("thread A begin "
						+ System.currentTimeMillis());
				Thread.sleep(1000);
				System.out.println("thread A end   "
						+ System.currentTimeMillis());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			ThreadB b = new ThreadB();
			ThreadA a = new ThreadA(b);
			a.start();
			b.start();
			b.join(200);
			System.out.println(" 	main  end" + System.currentTimeMillis());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class ThreadB extends Thread {

	public synchronized void run() {
		try {
			System.out.println("thread B begin " + System.currentTimeMillis());
			Thread.sleep(500);
			System.out.println("thread B end   " + System.currentTimeMillis());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
