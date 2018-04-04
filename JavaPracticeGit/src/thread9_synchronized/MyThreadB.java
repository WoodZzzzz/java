package thread9_synchronized;

public class MyThreadB extends Thread {

	private Task task;

	public MyThreadB(Task obj) {
		task = obj;
	}

	public void run() {
		task.doTask();
	}
}
