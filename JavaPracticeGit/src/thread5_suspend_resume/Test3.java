package thread5_suspend_resume;

/**
 * 
 * @����: suspend�����Ķ�ռ������
 * @��Ȩ: Copyright (c) 2017
 * @����: zwj
 * @��������: 2017��9��19�� ����4:38:46
 */
public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		MyThread3 thread = new MyThread3();
		thread.start();
		Thread.sleep(1000);
		thread.suspend();
		/*
		 * public void println(String x) { synchronized (this) { print(x);
		 * newLine(); } }
		 */
		/*
		 * �˶δ��벻��ִ�С�println������ͬ������,threadִ��һ��֮�󣬸պý���println�����У���ʱ���̸߳պñ���ͣ��
		 * ����println����δ�ͷţ����������߳�ʹ��println�����޷����ʡ�
		 */
		System.out.println("end");
	}
}
