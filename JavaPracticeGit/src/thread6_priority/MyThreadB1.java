package thread6_priority;

public class MyThreadB1 extends Thread {

	public void run() {
		System.out.println("�߳�B���߳����ȼ�Ϊ��" + this.getPriority());
		MyThreadA1 ta = new MyThreadA1();
		ta.start();
	}
}
