package thread.chapter3.s1.section10.single;

import java.util.ArrayList;
import java.util.List;

public class MyStack {

	private List list = new ArrayList();

	/**
	 * 
	 * @描述: 入栈
	 * @作者: Zhouwj
	 * @创建日期: 2017年10月10日 下午5:39:31
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
				System.out.println("pop操作" + Thread.currentThread().getName() + " 线程呈wait状态");
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
