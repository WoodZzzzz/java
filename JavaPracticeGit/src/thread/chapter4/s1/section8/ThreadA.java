package thread.chapter4.s1.section8;

public class ThreadA extends Thread {

	private MyService service;

	public ThreadA(MyService service) {
		this.service = service;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			service.use();
		}
	}
}

class ThreadB extends Thread {

	private MyService service;

	public ThreadB(MyService service) {
		this.service = service;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			service.set();
		}
	}
}