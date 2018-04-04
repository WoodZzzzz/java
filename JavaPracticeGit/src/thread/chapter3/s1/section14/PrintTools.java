package thread.chapter3.s1.section14;

public class PrintTools {

	private boolean prevA = false;

	public synchronized void printA() {
		try {
			while (prevA == true) {
				//System.out.println(Thread.currentThread().getName() + " wait ");
				this.wait();
			}
			for (int i = 0; i < 5; i++) {
				System.out.println("AAAAA");
			}
			this.notifyAll();
			prevA = true;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public synchronized void printB() {
		try {
			while (prevA == false) {
			//	System.out.println(Thread.currentThread().getName() + " wait ");
				this.wait();
			}
			for (int i = 0; i < 5; i++) {
				System.out.println("CCCCC");
			}
			this.notifyAll();
			prevA = false;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
