package thread.chapter3.s2.section4;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		MyThread thread = new MyThread();
		thread.start();
		thread.join();
		System.out.println(" main time = " + System.currentTimeMillis());
	}
}
