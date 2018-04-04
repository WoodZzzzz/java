package thread11_synchronized_nothis;

public class MyThreadA extends Thread {

	private MyObject mObj;
	private Service service;
	
	public MyThreadA(Service se, MyObject obj) {
		service = se;
		mObj = obj;
	}
	
	public void run() {
		service.testMethod1(mObj);
	}
	
}
