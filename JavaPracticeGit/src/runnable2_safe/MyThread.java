package runnable2_safe;

public class MyThread extends Thread {

	private int count = 5;

	public MyThread(String name) {
		this.setName(name);
	}

	public void run() {
		while (count > 0) {
			count--;
			System.out.println("由" + this.currentThread().getName()   //this可以换成Thread
					+ "计算,count=" + count);
		}
	}
}
