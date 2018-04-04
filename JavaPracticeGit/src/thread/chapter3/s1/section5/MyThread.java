package thread.chapter3.s1.section5;

public class MyThread extends Thread {

	private Object obj;
	 
	public MyThread(Object obj) {
		this.obj = obj;
	}
	
	public void run() {
		Service service = new Service();
		service.testService(obj);
	}
}
