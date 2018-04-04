package thread.chapter3.s1.section6;

public class ThreadA extends Thread {

	private Object obj;
	
	public ThreadA(Object obj) {
		this.obj = obj;
	}
	
	public void run() {
		Service service = new Service();
		service.testService(obj);
	}
}
