package thread.chapter6.s2.section1;

public class MyObject {

	private static MyObject obj;

	private MyObject() {

	}

	public static MyObject getInstance() {
		if (obj == null) {
			obj = new MyObject();
		}
		return obj;
	}
}
