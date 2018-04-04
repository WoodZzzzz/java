package thread5_sleep;

public class MyThread2 extends Thread {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 500000; i++) {
				if (this.interrupted()) {
					System.out.println("已经停止了，退出");
					throw new InterruptedException();
				}
				System.out.println("i = " + i);
			}
			System.out.println("for语句以外的");
		} catch (InterruptedException e) {
			System.out.println("进入run方法的catch中了");
			e.printStackTrace();
		}
	}
}
