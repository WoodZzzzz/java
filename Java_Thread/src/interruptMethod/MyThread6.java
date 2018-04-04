package interruptMethod;

public class MyThread6 extends Thread {

	private SynchronizedObject6 object;
	
	public MyThread6(SynchronizedObject6 object) {
		this.object = object;
	}
	
	public void run() {
		object.printString("b", "bb");
	}
}
