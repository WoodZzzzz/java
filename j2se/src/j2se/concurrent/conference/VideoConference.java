package j2se.concurrent.conference;

import java.util.concurrent.CountDownLatch;

public class VideoConference implements Runnable {

	private CountDownLatch countDown;

	public VideoConference(int count) {
		countDown = new CountDownLatch(count);
	}

	public void arrive(String name) {
		System.out.println("参与者" + name + "进入会议");
		countDown.countDown();
		System.out.println("还有" + countDown.getCount() + "人没有进入会场");
	}

	public void run() {
		System.out.println("会议正在等待" + countDown.getCount() + "人");
		try {
			countDown.await();
			System.out.println("参与者已经全部入场，会议开始");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
