package thread13_synchronized_string;

public class Service {

	public void printString(String strParam) {

		try {
			synchronized (strParam) {
				while (true) {
					System.out.println(Thread.currentThread().getName());
					Thread.sleep(1000);
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
