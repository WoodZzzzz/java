package thread.chapter4.s1.section11;

public class Run2 {

	public static void main(String[] args) {
		try {
			final Service2 service = new Service2();
			Runnable runnable = new Runnable() {
				public void run() {
					service.waitMethod();
				}
			};
			Thread[] tArray = new Thread[10];
			for (int i = 0; i < 10; i++) {
				tArray[i] = new Thread(runnable);
			}
			for (int i = 0; i < 10; i++) {
				tArray[i].start();
			}
			Thread.sleep(2000);
			service.notifyMethod();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
