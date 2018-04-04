package thread6_priority;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("main thread begin priority = "
				+ Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(6);
		System.out.println("main thread end priority = "
				+ Thread.currentThread().getPriority());
		MyThreadB1 mb = new MyThreadB1();
		mb.start();
	}

}
