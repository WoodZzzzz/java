package threadTest;

public class ThreadStatesTest extends Thread {

	public static void main(String[] args) {
		ThreadStatesTest thread = new ThreadStatesTest();
		thread.start();
		System.out.println(thread.getState());
	}

	public void run() {
		System.out.println(Thread.currentThread().getState());
		try {
			Thread.sleep(3000);
			this.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getState());
	}

}
