package thread.chapter3.s1.section4;

public class ThreadB extends Thread {

	private Object obj;
	
	public ThreadB(Object obj) {
		this.obj = obj;
	}
	
	public void run() {
		Service se = new Service();
		se.testService(obj);
	}
}
