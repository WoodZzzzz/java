package thread.chapter4.s1.section14;

public class MyThread extends Thread {
	private Service service;

	public MyThread(Service service) {
		this.service = service;
	}
	
	public void run() {
		service.testMethod();
	}
}
