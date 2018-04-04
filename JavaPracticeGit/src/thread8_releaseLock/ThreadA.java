package thread8_releaseLock;

public class ThreadA extends Thread {

	private Service service;
	
	public ThreadA(Service s) {
		service = s;
	}
	
	public void run() {
		service.method();
	}
}
