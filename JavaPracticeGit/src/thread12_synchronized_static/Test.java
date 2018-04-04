package thread12_synchronized_static;

public class Test {

	public static void main(String[] args) {
		ThreadA a = new ThreadA();
		a.setName("a");
		a.start();
		ThreadB b = new ThreadB();
		b.setName("b");
		b.start();
	}
}
