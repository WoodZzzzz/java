package thread5_suspend_resume;

public class MyThread2 extends Thread {

	public synchronized void printString() {
		if ("a".equals(Thread.currentThread().getName())) {
			System.out.println("��ǰ�̱߳���Զ����ͣ��" + Thread.currentThread().getName());
			Thread.currentThread().suspend();
		}
		System.out.println("end" + Thread.currentThread().getName());
	}
}
