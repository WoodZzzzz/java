package thread7_unsafe;

public class ThreadA2 extends Thread {

	private PublicVar pObj;
	 
	public ThreadA2(PublicVar obj) {
		pObj = obj;
	}
	
	public void run() {
		pObj.methodA("B", "BB");
	}
}
