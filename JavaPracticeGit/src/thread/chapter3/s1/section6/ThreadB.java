package thread.chapter3.s1.section6;

public class ThreadB extends Thread {

	private Object obj;
	
	public ThreadB(Object obj) {
		this.obj = obj;
	}
	
	@Override
	public void run() {
		Service service = new Service();
		service.testService(obj);
	}
}
