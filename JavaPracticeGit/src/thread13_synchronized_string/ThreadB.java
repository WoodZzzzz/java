package thread13_synchronized_string;

public class ThreadB extends Thread {

	private Service service;

	public ThreadB(Service se) {
		service = se;
	}

	public void run() {
		service.printString("AA");
	}
}
