package thread11_synchronized_nothis;


/**
 * 
 * @����: ��this�Ķ����� 
 *  ���߳�ִͬʱִ��sychronized(x){} �����ʱ��ͬ��Ч��
 * @��Ȩ: Copyright (c) 2017  
 * @����: zwj
 * @��������: 2017��9��21�� ����4:48:21
 */
public class MyTest {

	public static void main(String[] args) {
		MyObject obj = new MyObject();
//		MyObject obj2 = new MyObject();
		Service service = new Service();
		MyThreadA t1 = new MyThreadA(service, obj);
		t1.setName("A");
		t1.start();
//		MyThreadB t2 = new MyThreadB(service, obj2);
		MyThreadB t2 = new MyThreadB(service, obj);
		t2.setName("B");
		t2.start();
	}
}
