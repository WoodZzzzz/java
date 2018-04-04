package thread10_synchronized;


public class MyThreadB extends Thread {

	private MyList list;
	
	public MyThreadB(MyList list) {
		this.list = list;
	}
	
	public void run() {
		for (int i = 0; i < 100; i++) {
			list.add("threadB " + (i + 1));
		}
	}
}
