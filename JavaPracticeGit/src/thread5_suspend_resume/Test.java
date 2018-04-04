package thread5_suspend_resume;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		MyThread thread = new MyThread();
		thread.start();
		Thread.sleep(3000);
		thread.suspend();

		System.out.println("A = " + System.currentTimeMillis() + " i = "
				+ thread.getI());
		Thread.sleep(3000);
		System.out.println("A = " + System.currentTimeMillis() + " i = "
				+ thread.getI());
		
		thread.resume();
		Thread.sleep(3000);
		
		thread.suspend();
		System.out.println("B = " + System.currentTimeMillis() + " i = "
				+ thread.getI());
		Thread.sleep(3000);
		System.out.println("B = " + System.currentTimeMillis() + " i = "
				+ thread.getI());
	}

}
