package thread4_currentThread;

public class CountOperate2 extends Thread {

	public CountOperate2() {
		System.out.println("CountOperate2 -- begin");
		System.out.println("Thread.currentThread.getName() = "
				+ Thread.currentThread().getName());
		System.out.println("Thread.currentThread.isAlive() = "
				+ Thread.currentThread().isAlive());
		System.out.println("this.getName() = " + this.getName());
		System.out.println("this.isAlive() = " + this.isAlive());
		System.out.println("this = " + this);  //this表示调用该方法所属对象的引用
		System.out.println("CountOperate2 -- end");
	}

	@Override
	public void run() {
		System.out.println("run -- begin");
		System.out.println("Thread.currentThread.getName() = "
				+ Thread.currentThread().getName());
		System.out.println("Thread.currentThread.isAlive() = "
				+ Thread.currentThread().isAlive());
		System.out.println("this.getName() = " + this.getName());
		System.out.println("this.isAlive() = " + this.isAlive());
		System.out.println("this = " + this);  //this表示调用该方法所属对象的引用   // 为什么是c而不是t,c作为构造参数传递给Thread类，this相当于子类对象的引用，c（子） t（父）
		System.out.println("run -- end");
	}
}
