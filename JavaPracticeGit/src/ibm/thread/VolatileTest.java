package ibm.thread;

public class VolatileTest extends Thread {
	public void foo() {
		boolean flag = false;
		if(flag) {
			int i = 0;
			System.out.println(i);
		}
	}
	
	public void run() {
		foo();
	}
}
