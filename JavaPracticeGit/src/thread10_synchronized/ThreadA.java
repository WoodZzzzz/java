package thread10_synchronized;

public class ThreadA extends Thread {

	private Service service;
	
	public ThreadA(Service obj) {
		service = obj;
	}
	
	public void run() {
		service.a();
	}
}
