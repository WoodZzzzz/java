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
						System.out.println("�Ѿ�����֪ͨ");
					}
					System.out.println("�����" + (i + 1) + "��Ԫ��");
					Thread.sleep(1000);
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
