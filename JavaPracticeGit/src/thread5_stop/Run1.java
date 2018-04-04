package thread5_stop;

import java.util.logging.Logger;

/**
 * 
 * @����: interrupted() ���Ե�ǰ�߳��Ƿ����ж�״̬��ִ�к���н�״̬��־��Ϊfalse�Ĺ���
 *        isInterrupted() ���Ե�ǰ�̶߳����Ƿ����ж�״̬����������������� 
 * @��Ȩ: Copyright (c) 2017  
 * @����: zwj
 * @��������: 2017��10��9�� ����10:07:02
 */
public class Run1 {

	static Logger l = Logger.getLogger(Run1.class.getName());

	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			thread.sleep(1000);
			thread.interrupt();
//			Thread.currentThread().interrupt();
			l.info("Thread.currentThread = " + Thread.currentThread().getName());
			System.out.println("�Ƿ�ֹͣ1�� = " + thread.interrupted() + ", name=" + thread.getName());  //false
			System.out.println("�Ƿ�ֹͣ2�� = " + thread.interrupted() + ", name=" + thread.getName());  // false
		} catch (InterruptedException e) {
			l.info("main exception");
		}
		l.info("end!");
	}

}
