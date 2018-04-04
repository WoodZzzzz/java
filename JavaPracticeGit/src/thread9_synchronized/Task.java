package thread9_synchronized;

public class Task {

	private String data1;
	private String data2;
	public void doTask() {
		try {
			System.out.println("��ʼtask����");
			Thread.sleep(3000);
			String privateData1 = "�߳�" + Thread.currentThread().getName()
					+ "��;����3��ʱ�䴦��";
			String privateData2 = "�߳�" + Thread.currentThread().getName()
					+ "��;����3��ʱ�䴦��";
			synchronized (this) {
				data1 = privateData1;
				data2 = privateData2;
				System.out.println(Thread.currentThread().getName() + "������");
			}
			System.out.println(data1);  
			System.out.println(data2);//�п����ڴ�ӡ��仰��ʱ�򣬵ڶ����߳��Ѿ�ִ������17�У����ʱ������һֱ��ӡ����Thread-1
			System.out.println("��������������صõ���Ӧ��ֵ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
