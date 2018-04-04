package j2se.concurrent.conference;

import java.util.concurrent.CountDownLatch;

public class VideoConference implements Runnable {

	private CountDownLatch countDown;

	public VideoConference(int count) {
		countDown = new CountDownLatch(count);
	}

	public void arrive(String name) {
		System.out.println("������" + name + "�������");
		countDown.countDown();
		System.out.println("����" + countDown.getCount() + "��û�н���᳡");
	}

	public void run() {
		System.out.println("�������ڵȴ�" + countDown.getCount() + "��");
		try {
			countDown.await();
			System.out.println("�������Ѿ�ȫ���볡�����鿪ʼ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
