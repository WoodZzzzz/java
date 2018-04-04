package thread.chapter3.s1.section6;

public class Test {

	public static void main(String[] args) {
		try {
			Object obj = new Object();
			ThreadA a = new ThreadA(obj);
			a.start();
			ThreadB b = new ThreadB(obj);
			b.start();
			ThreadC c = new ThreadC(obj);
			c.start();
			Thread.sleep(3000);
			NotifyService no = new NotifyService(obj);
			no.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
