package thread9_synchronized;

public class MyThreadB2 extends Thread {

	private Task2 task;
	
	public MyThreadB2(Task2 obj) {
		task = obj;
	}
	
	public void run() {
		task.doOther();
	}
}
