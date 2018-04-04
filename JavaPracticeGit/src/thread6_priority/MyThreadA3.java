package thread6_priority;

public class MyThreadA3 extends Thread { 

	private int count = 0;
	
	public int getCount() {
		return count;
	}
	
	public void run() {
		while (true) {
			count++;
		}
	}
}

