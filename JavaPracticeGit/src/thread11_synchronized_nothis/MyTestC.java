package thread11_synchronized_nothis;

/**
 * 
 * @����: synchronized(x){}�����̷߳���ʱ�������̶߳�x������ͬ��������ͬ��Ч���ġ�
 * @��Ȩ: Copyright (c) 2017
 * @����: zwj
 * @��������: 2017��9��21�� ����4:59:47
 */
public class MyTestC {

	public static void main(String[] args) {
		MyObject obj = new MyObject();
		Service se = new Service();

		MyThreadA t1 = new MyThreadA(se, obj);
		t1.setName("A");
		t1.start();
		MyThreadB t2 = new MyThreadB(se, obj);
		t2.setName("B");
		t2.start();
		MyThreadC t3 = new MyThreadC(obj);
		t3.setName("C");
		t3.start();
	}

}
