package thread7_unsafe;

public class ThreadA extends Thread {
	
	private HasSelfPrivateNum hsObj;
	
	public ThreadA(HasSelfPrivateNum obj) {
		hsObj = obj;
	}
	
	public void run() {
		hsObj.addI("a");
	}
}
