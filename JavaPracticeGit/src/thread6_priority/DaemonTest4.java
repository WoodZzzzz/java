package thread6_priority;

public class DaemonTest4 {

	public static void main(String[] args) throws InterruptedException {
		MyThread4 thread = new MyThread4();
		thread.setDaemon(true);
		thread.start();
		Thread.sleep(5000);
		System.out.println("main �߳�ֹͣ�ˣ� �ػ��߳�threadҲ��ֹͣ��ӡ�ˣ���ӡһ�����");
	}

}
