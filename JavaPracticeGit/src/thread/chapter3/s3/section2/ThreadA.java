package thread.chapter3.s3.section2;

public class ThreadA extends Thread {

	public void run() {
		try {
			for (int i = 0; i < 100; i++) {
				Tools.t1.set("ThreadA" + (i + 1));
				System.out.println("ThreadA get Value = " + Tools.t1.get());
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
