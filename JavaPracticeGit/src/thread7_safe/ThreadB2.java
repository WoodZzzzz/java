package thread7_safe;

public class ThreadB2 extends Thread {

	private MyObject obj;
	 
	public ThreadB2(MyObject obj) {
		this.obj = obj;
	}
	
	public void run() {
		obj.methodA();
	}
}
