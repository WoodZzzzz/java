package thread8_releaseLock;

public class Service {

	public synchronized void method() {
		if ("a".equals(Thread.currentThread().getName())) {
			while (true) {
				if ("0.123456".equals(("" + Math.random()).substring(0, 8))) {
					System.out.println("thread "
							+ Thread.currentThread().getName() + " run time = "
							+ System.currentTimeMillis());
					Integer.parseInt("a");
				}
			}
		} else {
			System.out.println("thread " + Thread.currentThread().getName()
					+ " run time = " + System.currentTimeMillis());
		}
	}
}
