package thread8_reenterableLock;

public class TestSub {

	/**
	 * 
	 * @描述: 同步不具有继承性，（父类是同步方法，子类对应的方法是异步的，除非子类方法也加synchronized关键字）
	 * @作者: Zhouwj
	 * @创建日期: 2017年9月20日 下午6:26:17
	 * @param args
	 */
	public static void main(String[] args) {
		Sub sub = new Sub();
		MyThreadA t1 = new MyThreadA(sub);
		t1.setName("A");
		MyThreadB t2 = new MyThreadB(sub);
		t2.setName("B");
		t1.start();
		t2.start();
	}
}
