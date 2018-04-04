package thread5_stop;

public class Test3 {

	public static void main(String[] args) {
		try {
			MyThread3 my = new MyThread3();
			my.start();
			// InterruptedException - if any thread has interrupted the current
			// thread. The interrupted status of the current thread is cleared
			// when this exception is thrown.

			Thread.sleep(1000);
			my.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
