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
				System.out.println("�����" + (i + 1) + "��Ԫ��" + list.size());
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
