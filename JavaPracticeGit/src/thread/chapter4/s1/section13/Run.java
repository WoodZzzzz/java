package thread.chapter4.s1.section13;

public class Run {
	public static void main(String[] args) {
		try {
			final MyService se = new MyService();
			Runnable run = new Runnable() {
				public void run() {
					se.waitMethod();
				}
			};
			Thread a = new Thread(run);
			a.setName("A");
			a.start();
			Thread.sleep(500);
			Thread b = new Thread(run);
			b.setName("B");
			b.start();
//			Thread.sleep(500);
			b.interrupt();
			System.out.println("main end");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
