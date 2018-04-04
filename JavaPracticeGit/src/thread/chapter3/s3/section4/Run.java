package thread.chapter3.s3.section4;

public class Run {

	public static void main(String[] args) {
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();
		a.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b.start();
		
	}
}
