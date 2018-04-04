package thread.chapter4.s2.section1;

public class ThreadC extends Thread {

	private Service service;
	
	public ThreadC(Service service) {
		this.service = service;
	}
	
	public void run() {
		service.writeMethod();
	}
}

class ThreadD extends Thread {
	private Service service;
	
	public ThreadD(Service service) {
		this.service = service;
	}
	
	public void run() {
		service.writeMethod();
	}
}