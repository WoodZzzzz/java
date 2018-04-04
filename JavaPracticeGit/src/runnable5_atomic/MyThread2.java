package runnable5_atomic;

public class MyThread2 extends Thread {

	private MyService service;
	
	public MyThread2(MyService service) {
		this.service = service;
	}
	
	public void run() {
		service.addNum();
	}
}
