package thread5_sleep;

public class Test2 {

	public static void main(String[] args) {
		try {
			MyThread2 thread = new MyThread2();
			thread.start();
			Thread.sleep(1000); //��thread�߳�ִ��1�������ж�
			thread.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
