package thread8_releaseLock;

public class TestService {

	public static void main(String[] args) {
		Service service = new Service();
		ThreadA t1 = new ThreadA(service);
		t1.setName("a");
		ThreadB t2 = new ThreadB(service);
		t2.setName("b");
		t1.start();
		t2.start();
		
	}
}
