package thread.chapter3.s3.section4;

public class ThreadB extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("ThreadB " + Tools.t1.get());
			
		}
	}
}
