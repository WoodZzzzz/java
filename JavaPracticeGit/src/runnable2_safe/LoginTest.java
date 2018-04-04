package runnable2_safe;

public class LoginTest {
	public static void main(String[] args) {
		ALogin a = new ALogin("A");
		a.start();
		BLogin b = new BLogin("B");
		b.start();
	}
}
