package thread7_safe;

public class Parent {

	public int i = 10;
	
	public synchronized void operateIMainMethod() {
		try {
			if (i > 0) {
				i--;
				Thread.sleep(1000);
			}
			System.out.println("Main print i = " + i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
