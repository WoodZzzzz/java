package thread.chapter3.s1.section10;

public class ThreadSubstract extends Thread {

	private Substract sub;
	
	public ThreadSubstract(Substract sub) {
		this.sub = sub;
	}
	
	public void run() {
		sub.substract();
	}
}
