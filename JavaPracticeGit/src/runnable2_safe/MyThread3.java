package runnable2_safe;

public class MyThread3 extends Thread {
	private int count = 5;

	@Override
	public void run() {
		System.out.println("CurrentThread=" + Thread.currentThread().getName()
				+ ",count=" + (count--));
		//count-- ���ڴ�ӡ֮ǰ��ɵģ���ͬ������������߳�ͬʱִ��count--��Ȼ�������println������һ��һ������������˳��һ�����
	}
}
