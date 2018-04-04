package thread9_synchronized;

public class HalfTest {

	public static void main(String[] args) {
		HalfAsyncHalfSync ha = new HalfAsyncHalfSync();
		HalfThreadA t1 = new HalfThreadA(ha);
		t1.setName("A");
		HalfThreadB t2 = new HalfThreadB(ha);
		t2.setName("B");
		t1.start();
		t2.start();
	}
}
