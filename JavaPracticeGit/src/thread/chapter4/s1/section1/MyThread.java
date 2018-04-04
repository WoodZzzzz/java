package thread.chapter4.s1.section1;

public class MyThread extends Thread {

	private MyService service;
	
	public MyThread(MyService service) {
		this.service = service;
	}
	
	public void run() {
		service.testMethod();
	}
}
