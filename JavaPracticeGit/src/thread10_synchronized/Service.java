package thread10_synchronized;

public class Service {

	private String anyString = new String();

	public void a() {
		try {
			synchronized (anyString) {
				System.out.println(Thread.currentThread().getName() + " a begin");
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName() + " a end");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public synchronized void b() {
		System.out.println(Thread.currentThread().getName() + " b begin");
		System.out.println(Thread.currentThread().getName() + " b end");
	}
}
