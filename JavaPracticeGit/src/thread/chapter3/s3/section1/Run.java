package thread.chapter3.s3.section1;

public class Run {

	public static ThreadLocal t1 = new ThreadLocal();
	
	public static void main(String[] args) {
		if (t1.get() == null) {
			System.out.println("null");
			t1.set("value");
		}
		System.out.println(t1.get());
		System.out.println(t1.get());
	}
}
