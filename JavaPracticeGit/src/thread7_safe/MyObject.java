package thread7_safe;

public class MyObject {

	public synchronized void methodA() {
		try {
			System.out.println("begin methodA threadName = "
					+ Thread.currentThread().getName());
			Thread.sleep(2000);
			System.out.println("end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
