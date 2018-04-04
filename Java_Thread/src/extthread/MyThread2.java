package extthread;

public class MyThread2 extends Thread{
	
	public MyThread2(){
		System.out.println("构造方法 " + Thread.currentThread().getName());
	}
	
	public void run(){
		System.out.println("run方法的打印 " + Thread.currentThread().getName());
	}
}
