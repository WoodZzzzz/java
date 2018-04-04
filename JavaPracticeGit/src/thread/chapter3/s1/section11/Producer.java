package thread.chapter3.s1.section11;

public class Producer extends Thread {

	private Object lock;

	public Producer(Object lock) {
		this.lock = lock;
	}

	public void produce() {
		try {
			synchronized (lock) {
				while (!ValueObject.value.equals("")) {
					lock.wait();
				}
				String value = System.currentTimeMillis() + "_"
						+ System.nanoTime();
				System.out.println("set µÄÖµÊÇ" + value);
				ValueObject.value = value;
				lock.notifyAll();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void run() {
		while (true) {
			produce();
		}
	}
}
