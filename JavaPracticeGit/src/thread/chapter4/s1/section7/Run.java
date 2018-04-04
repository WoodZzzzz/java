package thread.chapter4.s1.section7;

public class Run {

	public static void main(String[] args) {
		Printer p = new Printer();
		ThreadA a = new ThreadA(p);
		a.start();
		ThreadB b = new ThreadB(p);
		b.start();
	}
}