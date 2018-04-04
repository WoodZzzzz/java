package extthread;

public class CountOperate extends Thread {
	public CountOperate(){
		System.out.println("构造方法开始");
		System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
		System.out.println("Thread.currentThread().isAlive()=" + Thread.currentThread().isAlive());
		System.out.println("this.getName()=" + this.getName());
		System.out.println("this.isAlive()=" + this.isAlive());
		System.out.println("构造方法结束");
	}
	
	public void run(){
		System.out.println("run -- 开始");
		System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
		System.out.println("Thread.currentThread().isAlive()=" + Thread.currentThread().isAlive());
		System.out.println("this.getName()=" + this.getName());
		System.out.println("this.isAlive()=" + this.isAlive());
		System.out.println("run -- 结束");
	}
}
