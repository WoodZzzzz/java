package thread12_synchronized_static;

public class ThreadA extends Thread {

	public void run() {
		Service.printA();
	}
}
