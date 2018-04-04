package runnable2_safe;

public class Test3 {

	/**
	 * 
	 * @描述: 关于i--和println的线程安全问题 
	 * @作者: Zhouwj
	 * @创建日期: 2017年9月18日 下午6:00:51
	 * @param args
	 */
	public static void main(String[] args) {
		MyThread3 thread = new MyThread3();
		Thread t1 = new Thread(thread, "A");
		Thread t2 = new Thread(thread, "B");
		Thread t3 = new Thread(thread, "C");
		Thread t4 = new Thread(thread, "D");
		Thread t5 = new Thread(thread, "E");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
