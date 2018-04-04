package thread.chapter4.s1.section7;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 * @����: �����߳̽����ӡ��boolean,��Ϊû���Ⱥ�˳��,����̲߳�������������ʽ,��Ϊ�Ⱥ�˳��123���ñ�֤ 
 * @��Ȩ: Copyright (c) 2017  
 * @����: zwj
 * @��������: 2017��10��12�� ����11:35:22
 */
public class Printer {

	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	private boolean printA = true;

	public void printA() {
		try {
			lock.lock();
			while (printA) {
				condition.await();
			}
			System.out.println("��");
			condition.signal();
			printA = true;
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public void printB() {
		try {
			lock.lock();
			while (printA == false) {
				condition.await();
			}
			System.out.println("��");
			condition.signal();
			printA = false;
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
}
