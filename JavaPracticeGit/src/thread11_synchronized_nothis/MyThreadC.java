package thread11_synchronized_nothis;

public class MyThreadC extends Thread {

	private MyObject mObj;
	
	public MyThreadC(MyObject obj) {
		mObj = obj;
	}
	
	public void run() {
		mObj.printString();
	}
}
