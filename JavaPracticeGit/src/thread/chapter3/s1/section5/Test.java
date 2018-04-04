package thread.chapter3.s1.section5;

public class Test {

	public static void main(String[] args) {
		try {
			Object obj = new Object();
			MyThread m = new MyThread(obj);
			m.start();
			Thread.sleep(3000);
			m.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
