package j2se.collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class CollectionsTest {

	public static void main(String[] args) {
		List list = new LinkedList();
		list.add(5);
		list.add(2);
		list.add(3);
		Collections.sort(list);
		for (Iterator it = list.iterator(); it.hasNext();) {
			System.out.print(it.next());
		}
		Collections.shuffle(list);
		for (Iterator it = list.iterator(); it.hasNext();) {
			System.out.print(it.next());
		}
		Collections.reverse(list);
		for (Iterator it = list.iterator(); it.hasNext();) {
			System.out.print(it.next());
		}
	}
}
