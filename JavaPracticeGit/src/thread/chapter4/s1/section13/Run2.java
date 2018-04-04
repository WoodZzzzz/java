package thread.chapter4.s1.section13;

public class Run2 {

	public static void main(String[] args) {
		final MyService2 service = new MyService2();
		Runnable run = new Runnable() {
			@Override
			public void run() {
				service.waitMethod();
			}
		};
		
		Thread threadA = new Thread(run);
		threadA.setName("A");
		threadA.start();
		
		Thread threadB = new Thread(run);
		threadB.setName("B");
		threadB.start();
	}
}
