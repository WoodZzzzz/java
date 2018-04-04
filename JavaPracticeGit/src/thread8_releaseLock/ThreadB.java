package thread8_releaseLock;

public class ThreadB extends Thread {

	private Service service;
	
	public ThreadB(Service s) {
		service = s;
	}
	
	public void run() {
		service.method();
	}
}
