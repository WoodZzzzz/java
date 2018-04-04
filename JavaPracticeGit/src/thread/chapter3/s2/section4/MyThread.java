package thread.chapter3.s2.section4;

public class MyThread extends Thread {

	public void run() {
		try {
			System.out.println("begin time = " + System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("end time = " + System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
