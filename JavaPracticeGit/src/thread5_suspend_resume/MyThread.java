package thread5_suspend_resume;

public class MyThread extends Thread {
	private long i;
	
	public void setI(int i) {
		this.i = i;
	}
	
	public long getI() {
		return i;
	}
	
	@Override
	public void run() {
		while (true) {
			i++;
		}
	}
}
