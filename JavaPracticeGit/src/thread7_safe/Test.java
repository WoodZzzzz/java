package thread7_safe;

public class Test {

	public static void main(String[] args) {
		HashSelfPrivateNum obj = new HashSelfPrivateNum();
		ThreadA t1 = new ThreadA(obj);
		t1.start();
		ThreadB t2 = new ThreadB(obj);
		t2.start();
	}
}
