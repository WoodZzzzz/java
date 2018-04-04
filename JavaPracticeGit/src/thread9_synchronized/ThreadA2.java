package thread9_synchronized;

public class ThreadA2 extends Thread {

	private ObjectService objService;
	
	public ThreadA2(ObjectService obj) {
		objService = obj;
	}
	
	public void run() {
		objService.serviceMethodA();
	}
}
