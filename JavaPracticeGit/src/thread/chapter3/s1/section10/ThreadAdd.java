package thread.chapter3.s1.section10;

public class ThreadAdd extends Thread {

	private Add add;
	
	public ThreadAdd(Add add) {
		this.add = add;
	}
	
	public void run() {
		add.add();
	}
}
