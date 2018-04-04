package thread5_stop;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		MyThread2 my = new MyThread2();
		my.start();
		Thread.sleep(2000);
		my.interrupt();
	}

}
