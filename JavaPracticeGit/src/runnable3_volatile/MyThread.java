package runnable3_volatile;

public class MyThread extends Thread {

	private static int count = 0;

	public void run() {
		addCount();
	}

	private synchronized void addCount() {
		for (int i = 0; i < 100; i++) {
			count++;
		}
		System.out.println("count=" + count);
	}
}
