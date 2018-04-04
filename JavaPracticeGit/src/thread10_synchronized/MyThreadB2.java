package thread10_synchronized;

public class MyThreadB2 extends Thread {

	private MyOneList2 list;
	
	public MyThreadB2(MyOneList2 list) {
		this.list = list;
	}
	
	public void run() {
		Service2 service = new Service2();
		service.serviceMethod(list, "B");
	}
}
