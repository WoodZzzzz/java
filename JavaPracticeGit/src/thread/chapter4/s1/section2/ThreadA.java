package thread.chapter4.s1.section2;

public class ThreadA extends Thread {

	private MyService service;
	
	public ThreadA(MyService service) {
		this.service = service;
	}
	
	public void run() {
		service.methodA();
	}
}

class ThreadAA extends Thread {
	
	private MyService service;
	
	public ThreadAA(MyService service) {
		this.service = service;
	}
	
	public void run() {
		service.methodA();
	}
}
