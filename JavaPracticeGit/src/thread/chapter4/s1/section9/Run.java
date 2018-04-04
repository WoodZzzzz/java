package thread.chapter4.s1.section9;

public class Run {
	public static void main(String[] args) {
//		final Service service = new Service(true);
		final Service service = new Service(false);
		Runnable runnable = new Runnable() {
			
			public void run() {
				service.testFair();
			}
		};
		
		Thread[] t = new Thread[10];
		for (int i = 0; i < 10; i++) {
			t[i] = new Thread(runnable);
		}
		for (int i = 0; i < 10; i++) {
			t[i].start();
		}
	}
}
