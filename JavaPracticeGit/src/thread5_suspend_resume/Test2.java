package thread5_suspend_resume;

/**
 * 
 * @描述: suspend方法的独占锁问题
 * @版权: Copyright (c) 2017  
 * @作者: zwj
 * @创建日期: 2017年9月19日 下午4:39:52
 */
public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		final MyThread2 my = new MyThread2();
		Thread t = new Thread() {
			public void run() {
				my.printString();
			}
		};
		t.setName("a");
		t.start();
		Thread.sleep(1000);
		
		Thread t2 = new Thread() {
			public void run() {
				System.out.println("t2启动了，但是进入不了printString方法");
				my.printString();
			}
		};
		t2.start();
	}

}
