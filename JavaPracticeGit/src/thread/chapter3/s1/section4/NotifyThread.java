package thread.chapter3.s1.section4;

public class NotifyThread extends Thread {

	private Object lock;
	
	public NotifyThread(Object lock) {
		this.lock = lock;
	}
	
	public void run() {
		Service service = new Service();
		service.synNotifyMethod(lock);
	}
	
}
