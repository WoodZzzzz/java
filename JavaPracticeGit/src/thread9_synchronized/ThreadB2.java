package thread9_synchronized;

public class ThreadB2 extends Thread {

	private ObjectService objService;
	
	public ThreadB2(ObjectService obj) {
		objService = obj;
	}
	
	public void run() {
		objService.serviceMethodB();
	}
}
