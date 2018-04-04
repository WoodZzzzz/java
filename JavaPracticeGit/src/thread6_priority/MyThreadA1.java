package thread6_priority;

public class MyThreadA1 extends Thread {

	public void run() {
		System.out.println("线程A的线程优先级为：" + this.getPriority());
	}
}
