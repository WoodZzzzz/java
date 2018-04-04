package thread6_priority;

public class Test {

	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
		System.out.println("main method -- " + Thread.currentThread().getName()
				+ " : " + Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(1);
	}

}
