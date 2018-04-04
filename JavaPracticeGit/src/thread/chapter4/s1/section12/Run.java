package thread.chapter4.s1.section12;

public class Run {
	public static void main(String[] args) {
		final Service s = new Service(true);
		Runnable run = new Runnable() {
			public void run() {
				s.serviceMethod();
			}
		};
		Thread t = new Thread(run);
		t.setName("t");
		t.start();
		
		final Service s2 = new Service(false);
		Runnable run2 = new Runnable() {
			public void run() {
				s2.serviceMethod();
			}
		};
		Thread t2 = new Thread(run2);
		t2.setName("t2");
		t2.start();
	}
}
