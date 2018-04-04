package thread.chapter6.s2.section3;

public class MyObject {

	private static class MyObjectHandler {
		private static MyObject myObject = new MyObject();
	}
	private MyObject() {
	}
	
	public static MyObject getInstance() {
		return MyObjectHandler.myObject;
	}
}
