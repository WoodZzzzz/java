package runnable2_safe;

public class Test2 {
	
	/**
	 * @描述: 共享数据，线程安全
	 * @作者: Zhouwj
	 * @创建日期: 2017年9月18日 下午5:09:32
	 * @param args
	 */
	public static void main(String[] args) {
		//TODO 如果只创建三个线程，数据并没有完全处理完，需要改造程序
		MyThread2 my = new MyThread2();
		Thread t1 = new Thread(my, "A");
		Thread t2 = new Thread(my, "B");
		Thread t3 = new Thread(my, "C");
		t1.start();
		t2.start();
		t3.start();
	}
}