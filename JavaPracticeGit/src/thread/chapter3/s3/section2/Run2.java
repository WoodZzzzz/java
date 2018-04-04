package thread.chapter3.s3.section2;

public class Run2 {
	public static void main(String[] args) {
		ThreadA2 a = new ThreadA2();
		ThreadB2 b = new ThreadB2();
		a.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b.start();
	}
}
