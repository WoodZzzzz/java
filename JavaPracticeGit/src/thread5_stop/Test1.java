package thread5_stop;

/**
 * 
 * @����: interrupt�޷�ֱ��ֹͣ�߳�
 * @��Ȩ: Copyright (c) 2017  
 * @����: zwj
 * @��������: 2017��9��19�� ����9:12:43
 */
public class Test1 {
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(2000);
			thread.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
