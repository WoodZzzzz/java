package runnable5_atomic;

public class Run {

	public static void main(String[] args) {
		AddCountThread acThread = new AddCountThread();
		Thread t1 = new Thread(acThread);
		t1.start();
		Thread t2 = new Thread(acThread);
		t2.start();
		Thread t3 = new Thread(acThread);
		t3.start();
		Thread t4 = new Thread(acThread);
		t4.start();
		Thread t5 = new Thread(acThread);
		t5.start();
	}
}
