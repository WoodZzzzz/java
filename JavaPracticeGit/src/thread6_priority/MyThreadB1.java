package thread6_priority;

public class MyThreadB1 extends Thread {

	public void run() {
		System.out.println("线程B的线程优先级为：" + this.getPriority());
		MyThreadA1 ta = new MyThreadA1();
		ta.start();
	}
}
