package runnable2_safe;

public class Test {
	/**
	 * 
	 * @����: �����̲߳��������ݣ����̰߳�ȫ
	 * @����: Zhouwj
	 * @��������: 2017��9��18�� ����4:18:20
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
