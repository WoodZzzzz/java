package thread5_sleep;

public class MyThread2 extends Thread {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 500000; i++) {
				if (this.interrupted()) {
					System.out.println("�Ѿ�ֹͣ�ˣ��˳�");
					throw new InterruptedException();
				}
				System.out.println("i = " + i);
			}
			System.out.println("for��������");
		} catch (InterruptedException e) {
			System.out.println("����run������catch����");
			e.printStackTrace();
		}
	}
}
