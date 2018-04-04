package thread7_safe;

public class ServiceThread extends Thread {

	public void run() {
		Service service = new Service();
		service.service();
	}
}
