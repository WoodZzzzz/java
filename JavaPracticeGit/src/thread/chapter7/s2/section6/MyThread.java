package thread.chapter7.s2.section6;

public class MyThread extends Thread {

	public MyThread(ThreadGroup group, String name) {
		super(group, name);
	}
	
	@Override
	public void run() {
		System.out.println("ThreadName=" + Thread.currentThread().getName() + "׼����ʼ��ѭ����");
		while (!this.isInterrupted()) {
		}
		System.out.println("ThreadName=" + Thread.currentThread().getName() + "������");
	}
}
