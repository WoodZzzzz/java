package runnable;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("����������");
		System.out.println(Thread.currentThread().getName());
	}
	
}
