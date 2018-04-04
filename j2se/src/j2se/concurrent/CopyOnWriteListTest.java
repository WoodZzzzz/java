package j2se.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteListTest {

	public static void main(String[] args) {
		final List list = new CopyOnWriteArrayList();
//		final List list = new ArrayList();
		list.add("111111");
		list.add("222222");
		list.add("333333");
		list.add("444444");
		Thread a = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 1000; i++) {
					list.add(0, i);
				}
			}
		});
		Thread b = new Thread(new Runnable() {
			public void run() {
				for (Iterator ite = list.iterator(); ite.hasNext();) {
					System.out.println(ite.next());
				}
			}
		});
		a.start();
		b.start();
	}
	
}
