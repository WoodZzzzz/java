package thread6_priority;

public class MyThreadA1 extends Thread {

	public void run() {
		System.out.println("�߳�A���߳����ȼ�Ϊ��" + this.getPriority());
	}
}
