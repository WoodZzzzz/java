package thread.chapter3.s1.section4;

public class Test {

	public static void main(String[] args) {
		Object obj = new Object();
		ThreadA a = new ThreadA(obj);
		a.start();
		ThreadB b = new ThreadB(obj);
		b.start();
	}
}
