package thread5_suspend_resume;

/**
 * 
 * @描述: suspend方法的独占锁问题
 * @版权: Copyright (c) 2017
 * @作者: zwj
 * @创建日期: 2017年9月19日 下午4:38:46
 */
public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		MyThread3 thread = new MyThread3();
		thread.start();
		Thread.sleep(1000);
		thread.suspend();
		/*
		 * public void println(String x) { synchronized (this) { print(x);
		 * newLine(); } }
		 */
		/*
		 * 此段代码不会执行。println方法是同步方法,thread执行一秒之后，刚好进入println方法中，此时该线程刚好被暂停，
		 * 则导致println的锁未释放，导致其他线程使用println方法无法访问。
		 */
		System.out.println("end");
	}
}
