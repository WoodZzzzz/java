package thread.chapter3.s1.section3;

public class MyThreadA extends Thread {

	private MyList list;
	private Object lock;

	public MyThreadA(MyList list, Object lock) {
		this.list = list;
		this.lock = lock;
	}

	public void run() {
		try {
			synchronized (lock) {
				for (int i = 0; i < 10; i++) {
					list.add();
					if (list.size() == 5) {
						lock.notify();
						System.out.println("已经发出通知");
					}
					System.out.println("添加了" + (i + 1) + "个元素");
					Thread.sleep(1000);
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
