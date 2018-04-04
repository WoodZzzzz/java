package thread4_currentThread;

public class MyThread extends Thread {
	public MyThread() {
//		this.setName("A");
		System.out.println("构造方法的打印:" + Thread.currentThread().getName());
	}
	
	@Override
	public void run() {
		System.out.println("run方法的打印:" + Thread.currentThread().getName());
		System.out.println("run this.isAlive :" + this.isAlive());
	}
}
