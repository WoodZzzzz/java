package thread.chapter6.s1;

public class MyObject {

	private static MyObject obj = new MyObject();
	
	private MyObject() {
	}
	
	public static MyObject getInstance() {
		return obj;
	}
}
