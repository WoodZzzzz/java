package thread4_currentThread;

public class MyThread extends Thread {
	public MyThread() {
//		this.setName("A");
		System.out.println("���췽���Ĵ�ӡ:" + Thread.currentThread().getName());
	}
	
	@Override
	public void run() {
		System.out.println("run�����Ĵ�ӡ:" + Thread.currentThread().getName());
		System.out.println("run this.isAlive :" + this.isAlive());
	}
}
