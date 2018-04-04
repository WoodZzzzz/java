package thread.chapter3.s1.section10.multiProduceMultiConsume;

public class ThreadP extends Thread {

	private Producer p;
	
	public ThreadP(Producer p) {
		this.p = p;
	}
	
	public void run() {
		while (true) {
			p.pushMethod();
		}
	}
}
