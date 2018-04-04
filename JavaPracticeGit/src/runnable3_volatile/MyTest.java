package runnable3_volatile;

public class MyTest {

	public static void main(String[] args) {
		MyThread[] t = new MyThread[100];
		for (int i = 0; i < 100; i++) {
			t[i] = new MyThread();
		}
		
		for (int i = 0; i < 100; i++) {
			t[i].start();
		}
	}
}
