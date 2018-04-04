package thread12_synchronized_static;

public class Service {

	public synchronized static void printA() {
		try {
			System.out.println("�߳�����Ϊ��" + Thread.currentThread().getName()
					+ "��" + System.currentTimeMillis() + "����printA");
			Thread.sleep(4000);
			System.out.println("�߳�����Ϊ��" + Thread.currentThread().getName()
					+ "��" + System.currentTimeMillis() + "�뿪printA");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public synchronized static void printB() {
		System.out.println("�߳�����Ϊ��" + Thread.currentThread().getName() + "��"
				+ System.currentTimeMillis() + "����printB");
		System.out.println("�߳�����Ϊ��" + Thread.currentThread().getName() + "��"
				+ System.currentTimeMillis() + "�뿪printB");
	}
}
