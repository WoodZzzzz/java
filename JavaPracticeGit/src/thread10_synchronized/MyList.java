package thread10_synchronized;

import java.util.ArrayList;
import java.util.List;

public class MyList {

	private List list = new ArrayList();

	public synchronized void add(String username) {
		System.out.println("ThreadName " + Thread.currentThread().getName()
				+ " ִ����add����!");
		list.add(username);
		System.out.println("ThreadName " + Thread.currentThread().getName()
				+ " �˳���add����!");
	}
	
	public synchronized int getSize() {
		System.out.println("ThreadName " + Thread.currentThread().getName()
				+ " ִ����getSize����");
		int sizeValue = list.size();
		System.out.println("ThreadName " + Thread.currentThread().getName()
				+ " �˳���getSize����");
		return sizeValue;
	} 
}
