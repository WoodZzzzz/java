package thread9_synchronized;

public class MyThreadA extends Thread {

	private Task task;
	
	public MyThreadA(Task obj) {
		task = obj;
	}
	
	public void run() {
		task.doTask();
	}
}
