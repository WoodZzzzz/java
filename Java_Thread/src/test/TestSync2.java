package test;

public class TestSync2 implements Runnable {

	int b = 100;
	
	synchronized void m1() throws InterruptedException {
		b = 1000;
		Thread.sleep(500);
		System.out.println("b = " + b);
	}
	
	synchronized void m2() throws InterruptedException {
		Thread.sleep(250);
		b = 2000;
	}
	
	public static void main(String[] args) throws InterruptedException {
		TestSync2 tt = new TestSync2();
		Thread t = new Thread(tt);
		t.start();
//		Thread.sleep(1000);
		tt.m2();
		System.out.println("main thread b = " + tt.b);
		/**
		 * 由于在main线程中增加了一个子线程。t.start执行的m1和main执行的m2都有可能先执行。
		 * 所以分两种情况，第一种main线程先执行了m2方法 t线程进行等待，此时b=2000，然后输出 main thread b = 2000，
		 * 这个时候 t线程则开始执行m1，然后输出b = 1000。
		 * 第二种情况，main线程先执行了m2,此时b=2000，释放锁，还未等到执行system.out 然后t线程马上进入执行b=1000，此时b=1000，输出main thread b = 1000,
		 * 然后 执行完m1方法 输出 b = 1000
		 * 第三种情况 t线程先执行，b=1000,然后main thread b = 2000
		 */
	}

	@Override
	public void run() {
		try {
			m1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
