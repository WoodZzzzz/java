package thread9_synchronized;

public class HalfAsyncHalfSync {

	public void printString() {
		for (int i = 0; i < 100; i++) {
			System.out.println("asynchronized block thread name is "
					+ Thread.currentThread().getName() + " i = " + i);
		}
		synchronized (this) {
			for (int i = 0; i < 100; i++) {
				System.out.println("synchronized block thread name is "
						+ Thread.currentThread().getName() + " i = " + i);
			}
		}
	}
}
