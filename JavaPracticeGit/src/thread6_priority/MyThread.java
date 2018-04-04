package thread6_priority;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		System.out.println(this.getPriority());
	}
}
