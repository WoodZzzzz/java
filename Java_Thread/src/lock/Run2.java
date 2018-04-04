package lock;

public class Run2 {

	public static void main(String[] args) {
		try {
			MyThread2 m2 = new MyThread2();
			m2.start();
			Thread.sleep(1000);
			m2.suspend();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
