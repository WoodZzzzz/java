package thread7_safe;

public class Test2 {

	public static void main(String[] args) {
		MyObject obj = new MyObject();
		ThreadA2 t1 = new ThreadA2(obj);
		t1.setName("A");
		ThreadB2 t2 = new ThreadB2(obj);
		t2.setName("B");	
		t1.start();
		t2.start();
	}
}
