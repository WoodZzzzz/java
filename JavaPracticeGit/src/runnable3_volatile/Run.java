package runnable3_volatile;

/**
 * 
 * @����: �������-serverģʽ��ȡ����˽���ڴ��isRunningֵ��ʹ��volatileǿ�����̴߳����ڴ��л�ȡ���µ�ֵ
 *  ���������-serverģʽ��ȡ�����ڴ��isRunningֻ
 * @��Ȩ: Copyright (c) 2017  
 * @����: zwj
 * @��������: 2017��9��22�� ����5:12:56
 */
public class Run {

	public static void main(String[] args) {
		try {
			RunThread thread = new RunThread();
			thread.start();
			Thread.sleep(1000);
			thread.setRunning(false);
			System.out.println("�Ѿ��ѱ���ֵΪfalse��");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
