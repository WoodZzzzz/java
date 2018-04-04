package thread.chapter3.s2.section1;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		MyThread thread = new MyThread();
		thread.start();
		thread.join(1000);
//		Thread.sleep(1);
		System.out.println("等thread线程执行完之后在执行此语句" + System.currentTimeMillis());
	}
}
