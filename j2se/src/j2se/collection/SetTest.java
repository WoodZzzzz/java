package j2se.collection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		TreeSet tree = new TreeSet(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		HashSet hash = new HashSet();
		hash.add(null);
		System.out.println(hash.contains(null));
		tree.add(new Dog(3));
		tree.add(new Dog(1));
		tree.add(new Dog(2));
		
		Iterator ite = tree.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		LinkedHashSet set = new LinkedHashSet();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		
	}
}
class Dog implements Comparable<Dog> {
	
	private int size; 
	
	public Dog(int s) {
		size = s;
	}
	
	@Override
	public String toString() {
		return size + "";
	}

	public int compareTo(Dog o) {
		return size - o.size;
	}

}
