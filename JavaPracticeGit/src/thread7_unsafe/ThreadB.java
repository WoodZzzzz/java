package thread7_unsafe;

public class ThreadB extends Thread {

	private HasSelfPrivateNum hsObj;
	
	public ThreadB(HasSelfPrivateNum obj) {
		hsObj = obj;
	}
	
	public void run() {
		hsObj.addI("b");
	}
}
