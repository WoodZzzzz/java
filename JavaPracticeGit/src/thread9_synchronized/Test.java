package thread9_synchronized;

public class Test {

	public static void main(String[] args) {
		Task task = new Task();
		MyThreadA t1 = new MyThreadA(task);
		t1.start();
		MyThreadB t2 = new MyThreadB(task);
		t2.start();
		
		/**
		 * ��ʼtask����
��ʼtask����
Thread-0������
�߳�Thread-0��;����3��ʱ�䴦��
�߳�Thread-1��;����3��ʱ�䴦��
��������������صõ���Ӧ��ֵ
Thread-1������
�߳�Thread-1��;����3��ʱ�䴦��
�߳�Thread-1��;����3��ʱ�䴦��
��������������صõ���Ӧ��ֵ
		 */
		//Ϊʲô���������ͼ������Thread-1ִ�������Σ�ԭ�����п����ڴ�ӡ��仰��ʱ�򣬵ڶ����߳��Ѿ�ִ������17�У����ʱ������һֱ��ӡ����Thread-1
	}
}
