package thread13_synchronized_deadlock;

public class TestDeadLock {
	
	public static void main(String[] args) {
		DeadLock lock = new DeadLock();
		Thread t1 = new Thread(lock);
		t1.setName("a");
		t1.start();
		Thread t2 = new Thread(lock);
		t2.setName("b");
		t2.start();
	}

}
