package thread5_stop;

public class MyThread3 extends Thread {

	public void run() {
		try {
			for (int i = 0; i < 50000000; i++) {
				if (interrupted()) {
					System.out.println("已经是停止状态了");
					throw new InterruptedException();
				}
				System.out.println();
			}
			System.out.println("for的下面");
		} catch (InterruptedException e) {
			System.out.println("进MyThread.java类run方法中的catch了");
			e.printStackTrace();
		}
	}
}
