package thread5_stop;

public class MyThread3 extends Thread {

	public void run() {
		try {
			for (int i = 0; i < 50000000; i++) {
				if (interrupted()) {
					System.out.println("�Ѿ���ֹͣ״̬��");
					throw new InterruptedException();
				}
				System.out.println();
			}
			System.out.println("for������");
		} catch (InterruptedException e) {
			System.out.println("��MyThread.java��run�����е�catch��");
			e.printStackTrace();
		}
	}
}
