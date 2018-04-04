package thread.chapter3.s1.section5;

public class Service {

	public void testService(Object obj) {
		try {
			synchronized (obj) {
				System.out.println("begin wait()");
				obj.wait();
				System.out.println("end wait()");
			}
		} catch (InterruptedException e) {
			System.out.println("wait中的线程被interrupt了");
			e.printStackTrace();
		}
	}
}
