package runnable3_volatile;

public class RunThread extends Thread {

	private volatile boolean isRunning = true;

	public boolean isRunning() {
		return isRunning;
	}

	public void setRunning(boolean flag) {
		isRunning = flag;
	}

	public void run() {
		System.out.println("进入run方法了");
		while (isRunning == true) {
		}
		System.out.println("线程已经被停止了");
	}
}
