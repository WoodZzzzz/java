package thread.chapter3.s1.section1;

public class ThreadA extends Thread {

	private MyList list;
	
	public ThreadA(MyList list) {
		this.list = list;
	}
	
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				list.add();
				System.out.println("添加了" + (i + 1) + "个元素" + list.size());
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
