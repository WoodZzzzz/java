package runnable6_synchronized_volatile;

public class ThreadB extends Thread {

	private Service service;
	
	public ThreadB(Service s) {
		service = s;
	}
	
	public void run() {
		service.stopMethod();
	}
}
