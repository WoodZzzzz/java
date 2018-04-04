package thread.chapter4.s1.section10;

public class Run {
	public static void main(String[] args) {
		/**
		 * getHoldCount
		 */
		Service service = new Service();
		service.testMethod1();

		
		/**
		 * getQueueLength
		 */
		final Service se = new Service();
		Runnable runnable = new Runnable() {
			public void run() {
				se.testQueueLength();
			}
		};
		Thread[] tArray = new Thread[10];
		for (int i = 0; i < tArray.length; i++) {
			tArray[i] = new Thread(runnable);
		}
		for (int i = 0; i < tArray.length; i++) {
			tArray[i].start();
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("有" + se.lock.getQueueLength() + "在等待获取锁");
		
		/**
		 * 
		 */
		final Service se2 = new Service();
		Runnable runnable2 = new Runnable() {
			public void run() {
				se2.testAwaitMethod();
			}
		};
		Thread[] tArray2 = new Thread[10];
		for (int i = 0; i < 10; i++) {
			tArray2[i] = new Thread(runnable2);
		}
		for (int i = 0; i < 10; i++) {
			tArray2[i].start();
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		se2.testNotifyMethod();
	}
}
