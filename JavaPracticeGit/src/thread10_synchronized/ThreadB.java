package thread10_synchronized;

public class ThreadB extends Thread {

	private Service service;
	
	public ThreadB(Service obj) {
		service = obj;
	}
	
	public void run() {
		service.b();
	}
	
}
