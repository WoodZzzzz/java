package thread.chapter7.s3.section3;

public class MyThread extends Thread {

	private Object lock;
	private String showChar;
	private int showNumPosition;
	private int printCount = 0;
	private static int addNumber = 1;

	public MyThread(Object lock, String showChar, int showNumPosition) {
		this.lock = lock;
		this.showChar = showChar;
		this.showNumPosition = showNumPosition;
	}

	@Override
	public void run() {
		try {
			synchronized (lock) {
				while (true) {
					if (addNumber % 3 == showNumPosition) {
						System.out.println(showChar);
						lock.notifyAll();
						addNumber++;
						printCount++;
						if (printCount == 10)
							break;
					} else {
						lock.wait();
					}
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Object obj = new Object();
		MyThread t1 = new MyThread(obj, "A", 1);
		MyThread t2 = new MyThread(obj, "B", 2);
		MyThread t3 = new MyThread(obj, "C", 0);
		t1.start();
		t2.start();
		t3.start();
	}
}
