package thread.chapter6.s2.section2;

public class Run {

	public static void main(String[] args) {
		MyThreadA a = new MyThreadA();
		MyThreadA b = new MyThreadA();
		MyThreadA c = new MyThreadA();
		a.start();
		b.start();
		c.start();
	}
}
