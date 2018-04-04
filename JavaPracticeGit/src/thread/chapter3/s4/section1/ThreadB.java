package thread.chapter3.s4.section1;

public class ThreadB extends Thread {

	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("ThreadB = " + Tools.t1.get());
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
