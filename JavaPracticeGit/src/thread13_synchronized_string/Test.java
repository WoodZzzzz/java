package thread13_synchronized_string;

public class Test {

	public static void main(String[] args) {
		Service se = new Service();
		ThreadA t1 = new ThreadA(se);
		t1.setName("A");
		t1.start();
		ThreadB t2 = new ThreadB(se);
		t2.setName("B");
		t2.start();
	}
}
