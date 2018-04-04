package j2se.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListTest {

	public static void main(String[] args) {
//		Collections.Cop
//		Arrays;
		List<String> li = Arrays.asList("123","21");
		li.add("33");
		System.out.println(li.size());
		ArrayList list = new ArrayList(10);
		list.add(null);
		for (Iterator it = list.iterator(); it.hasNext();) {
			Object ob = it.next();
			System.out.println("ob:" + ob);
		}
		System.out.println(list.size());
		System.out.println(list.get(0));
		LinkedList list2 = new LinkedList();
		List list3 = Collections.synchronizedList(new LinkedList());
		list2.addFirst(321);
		list2.add(1, 333);
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		Test t = new Test();
		ThreadTest1 t1 = new ThreadTest1(t);
		ThreadTest2 t2 = new ThreadTest2(t);
		t1.start(); 
		t2.start();
		
		Stack s = new Stack();
	}

}
class Test {
	Vector v = new Vector();
	public void add() {
		for (int i = 0; i < 10; i++) {
			v.add(123);
		}
	}
	
	public void get() {
		for (Iterator i = v.iterator();i.hasNext(); ) {
			System.out.println(i.next());
		}
	}
}
class ThreadTest1 extends Thread {
	
	private Test t;
	
	public ThreadTest1(Test t) {
		this.t = t;
	}

	public void run() {
		synchronized (this) {
			t.add();
		}
	}
	
}
class ThreadTest2 extends Thread {
	
	private Test t;
	
	public ThreadTest2(Test t) {
		this.t = t;
	}
	
	public void run() {
		synchronized (this) {
			t.get();
		}
	}
	
}
