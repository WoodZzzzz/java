package thread12_synchronized_static;

public class ThreadB extends Thread {

	public void run() {
		Service.printB();
	}
}
