package thread.chapter3.s1.section3;

public class MyThreadB extends Thread {

	private MyList list;
	private Object lock;

	public MyThreadB(MyList list, Object lock) {
		this.list = list;
		this.lock = lock;
	}

	public void run() {
		try {
			synchronized (lock) {
				if (list.size() != 5) {
					System.out.println("wait begin " + System.currentTimeMillis());
					lock.wait();
					System.out.println("wait end " + System.currentTimeMillis());
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
