package thread.chapter4.s1.section5;

public class Run {

	public static void main(String[] args) {
		MyService s = new MyService();
		ThreadA a = new ThreadA(s);
		ThreadB b = new ThreadB(s);
		a.start();
		b.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		s.signalAll();
	}
}
