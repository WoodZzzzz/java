package thread5_stop;

public class MyThread2 extends Thread {
	@Override
	public void run() {
		boolean flag = true;
		while (flag) {
			if (this.isInterrupted()) {
				System.out.println("ֹͣ��");
				return;
			}
		}
		System.out.println("while�����ִ����"); //return ֮�� ����ĸ÷����ͱ�������
	}
}
