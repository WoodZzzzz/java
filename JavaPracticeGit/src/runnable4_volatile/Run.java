package runnable4_volatile;

public class Run {

	public static void main(String[] args) {
		MyThread[] threadArray = new MyThread[100];
		for (int i = 0; i < 100; i++) {
			threadArray[i] = new MyThread();
		}
		
		for (int i = 0; i < 100; i++) {
			threadArray[i].start();
		}
	}
}
