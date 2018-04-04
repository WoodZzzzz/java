package thread.chapter3.s1.section6;

public class NotifyService extends Thread {

	private Object obj;
	
	public NotifyService(Object obj) {
		this.obj = obj;
	}
	
	public void run() {
		synchronized (obj) {
			obj.notify();
			obj.notifyAll();
		}
	}
}
