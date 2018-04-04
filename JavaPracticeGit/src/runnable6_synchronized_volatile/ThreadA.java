package runnable6_synchronized_volatile;

public class ThreadA extends Thread {

	private Service service;
	
	public ThreadA(Service s) {
		service = s;
	}
	
	public void run() {
		service.runMethod();
	}
}
