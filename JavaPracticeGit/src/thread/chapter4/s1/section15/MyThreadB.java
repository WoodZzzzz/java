package thread.chapter4.s1.section15;

public class MyThreadB extends Thread {

	private Service service;
	
	public MyThreadB(Service service) {
		this.service = service;
	}
	
	public void run() {
		service.notifyMethod();
	}
}
