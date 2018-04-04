package thread3;

public class MyThread extends Thread {
	
	private int i;
	
	public MyThread(int i) {
		this.i = i;
	}
	
	public void run() {
		System.out.println(i);
	}
}
