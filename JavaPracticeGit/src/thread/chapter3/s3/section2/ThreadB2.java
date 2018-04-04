package thread.chapter3.s3.section2;

import java.util.Date;

public class ThreadB2 extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			if (Tools2.t1.get() == null) {
				Tools2.t1.set(new Date());
			}
			System.out.println("ThreadB2 " + Tools2.t1.get().getTime());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
