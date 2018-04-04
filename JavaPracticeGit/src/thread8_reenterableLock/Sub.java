package thread8_reenterableLock;

import java.util.Date;

public class Sub extends Main {

	public synchronized void subService() {
		try {
			System.out.println("int sub 下一步 sleep begin threadName = "
					+ Thread.currentThread().getName() + " time = "
					+ new Date(System.currentTimeMillis()));
			Thread.sleep(5000);
			System.out.println("int sub 下一步 sleep end threadName = "
					+ Thread.currentThread().getName() + " time = "
					+ new Date(System.currentTimeMillis()));
			super.parentMethod();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
