package thread.chapter3.s1.section9;

public class MyRun {

	private Object obj = new Object();
	private boolean firstRun = false;

	private Runnable runnable1 = new Runnable() {
		public void run() {
			try {
				synchronized (obj) {
					while (firstRun == false) {
						System.out.println("wait begin");
						obj.wait();
						System.out.println("wait end");
					}
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};

	private Runnable runnable2 = new Runnable() {
		public void run() {
			synchronized (obj) {
				System.out.println("notify begin");
				obj.notify();
				System.out.println("notify end");
				firstRun = true;
			}
		}
	};

	public static void main(String[] args) {
		try {
			MyRun run = new MyRun();
			Thread t1 = new Thread(run.runnable1);
			t1.start();
			Thread.sleep(100);
			Thread t2 = new Thread(run.runnable2);
			t2.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
