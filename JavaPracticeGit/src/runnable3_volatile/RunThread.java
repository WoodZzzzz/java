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
		System.out.println("����run������");
		while (isRunning == true) {
		}
		System.out.println("�߳��Ѿ���ֹͣ��");
	}
}
