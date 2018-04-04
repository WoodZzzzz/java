package thread10_synchronized;

import java.util.ArrayList;
import java.util.List;

public class MyOneList2 {

	private List list = new ArrayList();

	public synchronized void add(String str) {
		list.add(str);
	}

	public synchronized int getSize() {
		return list.size();
	}
	
}
