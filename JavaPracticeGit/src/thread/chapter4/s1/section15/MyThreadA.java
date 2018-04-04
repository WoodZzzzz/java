package thread.chapter4.s1.section15;

public class MyThreadA extends Thread {

	private Service service;
	
	public MyThreadA(Service service) {
		this.service = service;
	}
	
	public void run() {
		service.waitMethod();
	}
}
