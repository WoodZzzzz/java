package thread7_safe;

public class ThreadA extends Thread {
	
	private HashSelfPrivateNum hsObj;
	
	public ThreadA(HashSelfPrivateNum obj) {
		hsObj = obj;
	}
	
	public void run() {
		hsObj.addI("a");
	}
}
