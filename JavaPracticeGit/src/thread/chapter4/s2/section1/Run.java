package thread.chapter4.s2.section1;

public class Run {
	
	public static void main(String[] args) {
		Service service = new Service();
		ThreadA a = new ThreadA(service);
		ThreadB b = new ThreadB(service);
		a.start();
		b.start();
		
		ThreadC c = new ThreadC(service);
		ThreadD d = new ThreadD(service);
		c.start();
		d.start();
	}
}
