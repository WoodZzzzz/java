package thread.chapter3.s1.section10.single;

import java.util.ArrayList;
import java.util.List;

public class MyStack {

	private List list = new ArrayList();

	/**
	 * 
	 * @����: ��ջ
	 * @����: Zhouwj
	 * @��������: 2017��10��10�� ����5:39:31
	 */
	public synchronized void push() {
		try {
			if (list.size() == 0) {
				this.wait();
			}
			list.add("str" + Math.random());
			this.notify();
			System.out.println("push size = " + list.size());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public synchronized String pop() {
		String returnValue = "";
		try {
			if (list.size() == 0) {
				System.out.println("pop����" + Thread.currentThread().getName() + " �̳߳�wait״̬");
				this.wait();
			}
			returnValue = "" + list.get(0);
			list.remove(0);
			this.notify();
			System.out.println("pop = " + list.size());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return returnValue;
	}
}
