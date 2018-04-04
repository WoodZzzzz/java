package thread5_stop;

public class MyThread2 extends Thread {
	@Override
	public void run() {
		boolean flag = true;
		while (flag) {
			if (this.isInterrupted()) {
				System.out.println("停止了");
				return;
			}
		}
		System.out.println("while以外的执行了"); //return 之后， 后面的该方法就被返回了
	}
}
