package thread8_reenterableLock;

public class MyThreadB extends Thread {

	private Sub sub;
	
	public MyThreadB(Sub obj) {
		sub = obj;
	}
	
	public void run() {
		sub.subService();
	}
}
