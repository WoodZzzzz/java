package thread.chapter3.s3.section4;

public class ThreadA extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("ThreadA " + Tools.t1.get());
		}
	}
}
