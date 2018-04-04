package thread11_synchronized_nothis;

public class Service {

	public void testMethod1(MyObject obj) {
		try {
			synchronized (obj) {
				System.out.println("testMethod1 get     Lock thread name "
						+ Thread.currentThread().getName() + " run time = "
						+ System.currentTimeMillis());
				Thread.sleep(2000);
				System.out.println("testMethod1 release Lock thread name "
						+ Thread.currentThread().getName() + " run time = "
						+ System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class MyObject {
	public synchronized void printString() {
//		synchronized (this) {} 也可以这样写， 效果一样
		System.out.println("printString get     Lock thread name "
				+ Thread.currentThread().getName() + " run time = "
				+ System.currentTimeMillis());
		System.out.println("------------");
		System.out.println("printString release Lock thread name "
				+ Thread.currentThread().getName() + " run time = "
				+ System.currentTimeMillis());
	}
}