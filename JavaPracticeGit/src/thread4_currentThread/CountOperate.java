package thread4_currentThread;

public class CountOperate extends Thread {
	public CountOperate() {
		System.out.println("CountOperate -- begin");
		System.out.println("Thread.currentThread().getName()="
				+ Thread.currentThread().getName());
		System.out.println("this.getName()=" + this.getName());
		System.out.println("CountOperate --- end");
	}
	
	public void run() {
		System.out.println("run --- begin");
		System.out.println("Thread.currentThread().getName()="
				+ Thread.currentThread().getName());
		System.out.println("this.getName()=" + this.getName());
	//	System.out.println("run" + this);  //打印当前调用这个run方法的所属对象的引用
		System.out.println("run -- end");
	}
}
