package thread.chapter3.s1.section11;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		Object obj = new Object();
		Producer p = new Producer(obj);
		p.setName("p1");
		Producer p2 = new Producer(obj);
		p2.setName("p2");
		p.start();
		p2.start();
		Consumer c = new Consumer(obj);
		c.setName("c1");
		Consumer c2 = new Consumer(obj);
		c2.setName("c2");
		c.start();
		c2.start();
		
		Thread.sleep(5000);
		Thread[] threadArray = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
		Thread.currentThread().getThreadGroup().enumerate(threadArray);
		for (int i = 0; i < threadArray.length; i++) {
			System.out.println(threadArray[i].getName() + " " +
					threadArray[i].getState());
		}
	}
}
