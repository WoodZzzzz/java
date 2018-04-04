package thread.chapter3.s1.section3;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		Object obj = new Object();
		MyThread1 m1 = new MyThread1(obj);
		m1.start();
		Thread.sleep(3000);
		MyThread2 m2 = new MyThread2(obj);
		m2.start();
	}
}
