package runnable2_safe;

public class MyThread3 extends Thread {
	private int count = 5;

	@Override
	public void run() {
		System.out.println("CurrentThread=" + Thread.currentThread().getName()
				+ ",count=" + (count--));
		//count-- 是在打印之前完成的，非同步方法，多个线程同时执行count--，然后堵塞在println方法，一个一个输出，则出现顺序不一致情况
	}
}
