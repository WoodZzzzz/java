package thread.chapter7.s2.section1;

public class ThreadA extends Thread {

	public void run() {
		try {
			while (!Thread.currentThread().isInterrupted()) {
				System.out.println("ThreadName = "
						+ Thread.currentThread().getName());
				Thread.sleep(4000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class ThreadB extends Thread {

	public void run() {
		try {
			while (!Thread.currentThread().isInterrupted()) {
				System.out.println("ThreadName = "
						+ Thread.currentThread().getName());
				Thread.sleep(4000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}