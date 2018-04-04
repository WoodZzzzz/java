package thread7_safe;

public class Service {

	public synchronized void service() {
		System.out.println("service");
		service2();
	}
	
	public synchronized void service2() {
		System.out.println("service2");
		service3();
	}

	public synchronized void service3() {
		System.out.println("service3");
	}
}
