package thread.chapter7.s2.section2;

public class Run {

	public static void main(String[] args) {
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		ThreadGroup group = new ThreadGroup(mainGroup, "A");
		Runnable run = new Runnable() {
			@Override
			public void run() {
				try {
					System.out.println("runThread");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread newThread = new Thread(group, run);
		newThread.setName("Z");
		newThread.start();
		
		ThreadGroup[] listGroup = new ThreadGroup[Thread.currentThread().getThreadGroup().activeCount()];
		Thread.currentThread().getThreadGroup().enumerate(listGroup);
		System.out.println("main线程中有多少个子线程组:" + listGroup.length + " 名字为:" + listGroup[0].getName());
		Thread[] listThread = new Thread[listGroup[0].activeCount()];
		listGroup[0].enumerate(listThread);
		System.out.println(listThread[0].getName());
	}
}
