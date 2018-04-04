package thread6_priority;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		MyThreadA3 ma = new MyThreadA3();
		ma.setPriority(Thread.NORM_PRIORITY - 3);
		ma.start();
		MyThreadB3 mb = new MyThreadB3();
		mb.setPriority(Thread.NORM_PRIORITY + 3);
		mb.start();
		Thread.sleep(10000);
		ma.stop();
		mb.stop();
		System.out.println(ma.getCount());
		System.out.println(mb.getCount());
	}
}
