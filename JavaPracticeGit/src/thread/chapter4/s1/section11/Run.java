package thread.chapter4.s1.section11;

public class Run {
	public static void main(String[] args) {
		try {
			final Service service = new Service();
			Runnable runnable = new Runnable() {
				public void run() {
					service.waitMethod();
				}
			};
			Thread a = new Thread(runnable);
			a.start();
			Thread.sleep(1000);
			Thread b = new Thread(runnable);
			b.start();
			Thread.sleep(1000);
			System.out.println(service.lock.hasQueuedThread(a)); // 查询a线程是否正在等待此锁定
			System.out.println(service.lock.hasQueuedThread(b));
			System.out.println(service.lock.hasQueuedThreads());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
