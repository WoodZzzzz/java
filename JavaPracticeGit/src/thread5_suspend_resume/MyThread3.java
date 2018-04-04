package thread5_suspend_resume;

public class MyThread3 extends Thread {

	private long i = 0;
	@Override 
	public void run() {
		while (true) {
			i++;
			System.out.println(i);
		}
	}
}
