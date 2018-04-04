package thread7_safe;

public class Sub extends Parent implements Runnable {

	public synchronized void operateISubMethod() {
		try {
			while (i > 0) {
				i--;
				System.out.println("sub print i = " + i);
				Thread.sleep(1000);
				this.operateIMainMethod();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void run() {
		Sub sub = new Sub();
		sub.operateISubMethod();
	}
}
