package runnable2_safe;

public class Test2 {
	
	/**
	 * @����: �������ݣ��̰߳�ȫ
	 * @����: Zhouwj
	 * @��������: 2017��9��18�� ����5:09:32
	 * @param args
	 */
	public static void main(String[] args) {
		//TODO ���ֻ���������̣߳����ݲ�û����ȫ�����꣬��Ҫ�������
		MyThread2 my = new MyThread2();
		Thread t1 = new Thread(my, "A");
		Thread t2 = new Thread(my, "B");
		Thread t3 = new Thread(my, "C");
		t1.start();
		t2.start();
		t3.start();
	}
}