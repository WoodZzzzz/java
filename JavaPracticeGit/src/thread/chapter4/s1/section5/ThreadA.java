package thread.chapter4.s1.section5;

public class ThreadA extends Thread {
	
	private MyService service;
	
	public ThreadA(MyService service) {
		this.service = service;
	}
	
	public void run() {
		service.awaitA();
	}
}

class ThreadB extends Thread {
	
	private MyService service;
	
	public ThreadB(MyService service) {
		this.service = service;
	}
	
	public void run() {
		service.awaitB();
	}
}
