package thread9_synchronized;

public class Task2 {

	public void doTask() {
		System.out.println("do Task begin thread name = "
				+ Thread.currentThread().getName());
		synchronized (this) {
			for (int i = 0; i < 100; i++) {
				System.out.println(Thread.currentThread().getName() + " i = "
						+ i);
			}
		}
	}

	public synchronized void doOther() {
		System.out.println("do other method thread name = "
				+ Thread.currentThread().getName());
	}

}
