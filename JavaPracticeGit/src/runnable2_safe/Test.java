package runnable2_safe;

public class Test {
	/**
	 * 
	 * @描述: 三个线程不共享数据，非线程安全
	 * @作者: Zhouwj
	 * @创建日期: 2017年9月18日 下午4:18:20
	 * @param args
	 */
	public static void main(String[] args) {
		MyThread m = new MyThread("A");
		MyThread m2 = new MyThread("B");
		MyThread m3 = new MyThread("C");
		m.start();
		m2.start();
		m3.start();
	}
}
