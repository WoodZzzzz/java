package thread7_safe;

public class ThreadA2 extends Thread {

	private MyObject obj;
	
	public ThreadA2(MyObject obj) {
		this.obj = obj;
	}
	
	public void run() {
		obj.methodA();
	}
}
