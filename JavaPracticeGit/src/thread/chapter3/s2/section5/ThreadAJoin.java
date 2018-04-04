package thread.chapter3.s2.section5;

public class ThreadAJoin extends Thread {

	private ThreadB b;

	public ThreadAJoin(ThreadB b) {
		this.b = b;
	}

	public void run() {
		try {
			synchronized (b) {
				b.start();
				b.join();
				Thread.sleep(10000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		ThreadB b = new ThreadB();
		ThreadAJoin a = new ThreadAJoin(b);
		a.start();
		
		Thread.sleep(1000);
		ThreadC c = new ThreadC(b);
		c.start();
	}
}

