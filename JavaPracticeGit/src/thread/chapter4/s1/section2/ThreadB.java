package thread.chapter4.s1.section2;

public class ThreadB extends Thread {

	private MyService service;
	
	public ThreadB(MyService service) {
		this.service = service;
	}
	
	public void run() {
		service.methodB();
	}
}
class ThreadBB extends Thread {
	
	private MyService service;
	
	public ThreadBB(MyService service) {
		this.service = service;
	}
	
	@Override
	public void run() {
		service.methodB();
	}
}
