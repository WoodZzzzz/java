package thread.chapter7.s2.section6;

/**
 * 
 * @����: �߳��������Ӷ���̣߳���������ѭ�����̣߳�ͨ���ж��߳������ж��߳�
 * @��Ȩ: Copyright (c) 2017  
 * @����: zwj
 * @��������: 2017��10��20�� ����9:25:56
 */
public class Run {
	public static void main(String[] args) {
		try {
			ThreadGroup group = new ThreadGroup("�ҵ��߳���");
			for (int i = 0; i < 5; i++) {
				MyThread thread = new MyThread(group, "�߳�" + (i + 1));
				thread.start();
			}
			Thread.sleep(5000);
			group.interrupt();
			System.out.println("������interrupt()����");
		} catch (InterruptedException e) {
			System.out.println("ֹͣ��");
			e.printStackTrace();
		}
	}
}
