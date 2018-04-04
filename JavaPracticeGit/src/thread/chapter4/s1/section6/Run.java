package thread.chapter4.s1.section6;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		MyService s = new MyService();
		ThreadA a = new ThreadA(s);
		a.start();
		ThreadB b = new ThreadB(s);
		b.start();
		
		Thread.sleep(2000);
		s.signalAllOfA();
		Thread.sleep(3000);
		s.signalAllOfB();
	}
}
