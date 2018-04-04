package thread9_synchronized;

public class Test2 {

	public static void main(String[] args) {
		ObjectService obj = new ObjectService();
		ThreadA2 t1 = new ThreadA2(obj);
		t1.setName("A");
		ThreadB2 t2 = new ThreadB2(obj);
		t2.setName("B");
		t2.start();
		t1.start();
	}
}
