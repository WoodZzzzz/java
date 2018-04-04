package lock;

public class MyThread2 extends Thread {
	private long i = 0;
	public void run() {
		while(true) {
			i++;
			System.out.println(i);
		}
	}
}
