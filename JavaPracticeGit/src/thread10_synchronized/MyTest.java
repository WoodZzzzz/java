package thread10_synchronized;

/**
 * 
 * @����: add������ͬ���ģ����Ƕ���߳�ִ��add�������첽�ģ����߳�A�����Ԫ�صĹ����У��߳�BҲ�������Ԫ�� ,
 * ����п��ܵ������
 * @��Ȩ: Copyright (c) 2017  
 * @����: zwj
 * @��������: 2017��9��21�� ����3:52:26
 */
public class MyTest {

	public static void main(String[] args) {
		MyList list = new MyList();
		MyThreadA t1 = new MyThreadA(list);
		t1.setName("A");
		t1.start();
		MyThreadB t2 = new MyThreadB(list);
		t2.setName("B");
		t2.start();
	}
}
