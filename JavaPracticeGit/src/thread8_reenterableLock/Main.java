package thread8_reenterableLock;

import java.util.Date;

public class Main {

	public synchronized void parentMethod() {
		try {
			System.out.println("int main 下一步 sleep begin threadName = "
					+ Thread.currentThread().getName() + " time = "
					+ new Date(System.currentTimeMillis()));
			Thread.sleep(5000);
			System.out.println("int main 下一步 sleep end threadName = "
					+ Thread.currentThread().getName() + " time = " 
					+ new Date(System.currentTimeMillis()));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
