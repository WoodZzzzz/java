package thread8_reenterableLock;

public class MyThreadA extends Thread {

	private Sub sub;
	
	public MyThreadA(Sub obj) {
		sub = obj;
	}
	
	public void run() {
		sub.subService();
	}
}
