package j2se.collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class MapTest {

	public static void main(String[] args) {
		/*Map map = new HashMap();
		Map table = new Hashtable();
		Map weak = new WeakHashMap();
		Map link = new LinkedHashMap();
		TreeMap tree = new TreeMap(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
		ConcurrentHashMap con = new ConcurrentHashMap();
		Iterator a = con.entrySet().iterator();
//		a.next();
		map.put(null, null);
		table.put("123", "1");
		weak.put(null, null);*/
//		new CopyOnWriteArrayList();
		
		Map<String, String> map1 = new HashMap<String, String>();
        map1.put("1", "A");
        map1.put("2", "B");
        map1.put("3", "C");
        System.out.println(map1);

        for (Map.Entry<String, String> entry : map1.entrySet()) {
            if (entry.getKey().equals("1")) {
                //抛并发修改异常  ConcurrentModificationException
//                map1.remove(entry.getKey());
                //抛并发修改异常  ConcurrentModificationException
//                map1.put("4", "D");
                //以下两句正常
                entry.setValue("123");
                map1.put(entry.getKey(), "123");
            }
        }
	}

}
