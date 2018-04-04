package thread7_safe;

public class TestService {

	public static void main(String[] args) {
		ServiceThread thread = new ServiceThread();
		thread.start();
	}
}
