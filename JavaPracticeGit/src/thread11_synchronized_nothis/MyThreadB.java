package thread11_synchronized_nothis;

public class MyThreadB extends Thread {

	private MyObject mObj;
	private Service service;

	public MyThreadB(Service se, MyObject obj) {
		service = se;
		mObj = obj;
	}

	public void run() {
		service.testMethod1(mObj);
	}
}
