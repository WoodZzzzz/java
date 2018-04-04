package thread7_safe;

public class TestSub {

	public static void main(String[] args) {
		Sub sub = new Sub();
		Thread t = new Thread(sub);
		t.start();
	}

}
