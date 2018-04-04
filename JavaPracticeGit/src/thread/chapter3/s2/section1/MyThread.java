package thread.chapter3.s2.section1;

public class MyThread extends Thread {

	public void run() {
		try {
			int sleepTime = (int) (Math.random() * 10000);
			System.out.println(System.currentTimeMillis());
//			Thread.sleep(sleepTime);
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
