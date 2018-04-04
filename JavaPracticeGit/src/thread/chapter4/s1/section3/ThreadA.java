package thread.chapter4.s1.section3;

public class ThreadA extends Thread {

	private MyService service;
	
	public ThreadA(MyService service) {
		this.service = service;
	}
	
	public void run() {
		service.await();
	}
}
