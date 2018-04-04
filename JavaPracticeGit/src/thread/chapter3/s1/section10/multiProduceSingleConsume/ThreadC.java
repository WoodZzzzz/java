package thread.chapter3.s1.section10.multiProduceSingleConsume;

public class ThreadC extends Thread {

	private Consumer c;
	
	public ThreadC(Consumer c) {
		this.c = c;
	}
	
	public void run() {
		while (true) {
			c.popMethod();
		}
	}
}
