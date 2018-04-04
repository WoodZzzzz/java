package thread.chapter4.s2.section1;

public class ThreadA extends Thread {
	private Service service;
	
	public ThreadA(Service service) {
		this.service = service;
	}
	
	public void run() {
		service.readMethod();
	}
}

class ThreadB extends Thread {
	private Service service;
	
	public ThreadB(Service service) {
		this.service = service;
	}
	
	public void run() {
		service.readMethod();
	}
}
