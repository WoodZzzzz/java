package thread10_synchronized;

public class Test {

	public static void main(String[] args) {
		Service s = new Service();
		ThreadA t1 = new ThreadA(s);
		t1.setName("A");
		t1.start();
		ThreadB t2 = new ThreadB(s);
		t2.setName("B");
		t2.start();
	}
}
