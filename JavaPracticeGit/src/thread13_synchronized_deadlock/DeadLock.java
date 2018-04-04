package thread13_synchronized_deadlock;

public class DeadLock implements Runnable {

	private Object lock1 = new Object();
	private Object lock2 = new Object();

	public void run() {
		try {
			if ("a".equals(Thread.currentThread().getName())) {
				synchronized (lock1) {
					System.out.println("A  enter lock1 block thread name is "
							+ Thread.currentThread().getName());

					Thread.sleep(3000);
					synchronized (lock2) {
						System.out.println("A  enter lock2 block thread name is"
								+ Thread.currentThread().getName());
					}
				}
				System.out.println("A  release lock1 and lock2 thread name is "
						+ Thread.currentThread().getName());
			}

			if ("b".equals(Thread.currentThread().getName())) {
				synchronized (lock2) {  //À¿À¯
					System.out.println("B  enter lock2 block thread name is "
							+ Thread.currentThread().getName());
					Thread.sleep(3000);
					synchronized (lock1) { //À¿À¯
						System.out.println("B  enter lock1 block thread name is"
								+ Thread.currentThread().getName());
					}
				}
				System.out.println("B  release lock1 and lock2 thread name is "
						+ Thread.currentThread().getName());
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
