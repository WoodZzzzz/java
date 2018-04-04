package thread.chapter3.s1.section6;

public class Service {

	public void testService(Object obj) {
		try {
			synchronized (obj) {
				System.out.println("thread " + Thread.currentThread().getName() + " begin wait");
				obj.wait();
				System.out.println("thread " + Thread.currentThread().getName() + " end wait");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
