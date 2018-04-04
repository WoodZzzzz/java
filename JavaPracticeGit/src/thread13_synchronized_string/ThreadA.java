package thread13_synchronized_string;

public class ThreadA extends Thread {

	private Service service;
	
	public ThreadA(Service se) {
		service = se;
	}
	
	public void run() {
		service.printString("AA");
	}
}
