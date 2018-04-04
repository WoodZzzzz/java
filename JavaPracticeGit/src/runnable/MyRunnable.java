package runnable;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("正在运行中");
		System.out.println(Thread.currentThread().getName());
	}
	
}
