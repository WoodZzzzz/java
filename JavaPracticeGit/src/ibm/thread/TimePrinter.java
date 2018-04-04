package ibm.thread;

import java.util.Date;

public class TimePrinter implements Runnable {

	int pauseTime;
	String name;

	public TimePrinter(String n, int t) {
		pauseTime = t;
		name = n;
	}

	@Override
	public void run() {
		while (true) {
			try {
				System.out.println(name + ":"
						+ new Date(System.currentTimeMillis()));
				Thread.sleep(pauseTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new TimePrinter("Fast Guy", 1000));
		t1.start();
		Thread t2 = new Thread(new TimePrinter("Slow Guy", 3000));
		t2.start();
	}
}
