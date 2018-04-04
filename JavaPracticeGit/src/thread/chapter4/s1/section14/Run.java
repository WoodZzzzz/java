package thread.chapter4.s1.section14;

public class Run {

	public static void main(String[] args) {
		try {
			Service service = new Service();
			MyThread m = new MyThread(service);
			m.start();
			Thread.sleep(3000);
			m.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
