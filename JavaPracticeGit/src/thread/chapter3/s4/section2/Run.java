package thread.chapter3.s4.section2;

public class Run {

	public static void main(String[] args) {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Main = " + Tools.t1.get());
			}
			Thread.sleep(5000);
			ThreadA a = new ThreadA();
			a.start();
			ThreadB b = new ThreadB();
			b.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
