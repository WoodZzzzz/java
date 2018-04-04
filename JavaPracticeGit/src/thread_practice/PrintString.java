package thread_practice;

import java.text.NumberFormat;

public class PrintString extends Thread {

	private int i = 0;
	NumberFormat formatter = NumberFormat.getNumberInstance();

	public synchronized void printString() throws InterruptedException {
		for (; i < 1000; i++) {
			formatter.setMinimumIntegerDigits(3);
			Thread.sleep(100);
			System.out.println(Thread.currentThread().getName() + ":" + formatter.format(i));
		}
	}

	public void run() {
		try {
			printString();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
