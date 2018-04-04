package thread9_synchronized;

public class MyThreadA2 extends Thread {

	private Task2 task;

	public MyThreadA2(Task2 obj) {
		task = obj;
	}

	public void run() {
		task.doTask();
	}
}
