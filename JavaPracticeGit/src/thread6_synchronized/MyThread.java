package thread6_synchronized;

public class MyThread extends Thread {
	
	private SynchronizedObject object;
	
	public MyThread(SynchronizedObject obj) {
		object = obj;
	}
	
	public void run() {
		object.printString("b", "bb");
	}
}
