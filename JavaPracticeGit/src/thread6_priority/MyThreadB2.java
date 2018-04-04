package thread6_priority;

public class MyThreadB2 extends Thread {

	public void run() {
		long beginTime = System.currentTimeMillis();
		long addResult = 0; 
		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < 50000; i++) {
				addResult = addResult + i;
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("¡î ¡î ¡î ¡î  thread 2 use time = " + (endTime - beginTime));
	}
}
