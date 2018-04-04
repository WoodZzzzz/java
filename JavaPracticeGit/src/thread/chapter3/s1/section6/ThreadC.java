package thread.chapter3.s1.section6;

public class ThreadC extends Thread {

	private Object obj;
	
	public ThreadC(Object obj) { 
		this.obj = obj;
	}
	
	public void run() {
		Service service = new Service();
		service.testService(obj);
	}
}
