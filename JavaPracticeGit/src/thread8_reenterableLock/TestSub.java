package thread8_reenterableLock;

public class TestSub {

	/**
	 * 
	 * @����: ͬ�������м̳��ԣ���������ͬ�������������Ӧ�ķ������첽�ģ��������෽��Ҳ��synchronized�ؼ��֣�
	 * @����: Zhouwj
	 * @��������: 2017��9��20�� ����6:26:17
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
