package runnable2_safe;

public class Test3 {

	/**
	 * 
	 * @����: ����i--��println���̰߳�ȫ���� 
	 * @����: Zhouwj
	 * @��������: 2017��9��18�� ����6:00:51
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
