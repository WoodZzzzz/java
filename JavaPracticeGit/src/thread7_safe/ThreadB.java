package thread7_safe;

public class ThreadB extends Thread {

	private HashSelfPrivateNum hsObj;
	
	public ThreadB(HashSelfPrivateNum obj) {
		hsObj = obj;
	}
	
	public void run() {
		hsObj.addI("b");
	}
}
