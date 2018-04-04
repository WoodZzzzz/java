package thread10_synchronized;

public class MyThreadA extends Thread {

	private MyList list;
	
	public MyThreadA(MyList list) {
		this.list = list;
	}
	
	public void run() {
		for (int i = 0; i < 100; i++) {
			list.add("threadA" + (i + 1));
		}
	}
}
