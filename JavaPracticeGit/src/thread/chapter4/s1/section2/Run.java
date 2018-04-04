package thread.chapter4.s1.section2;

public class Run {

	public static void main(String[] args) {
		try {
			MyService s = new MyService();
			ThreadA a = new ThreadA(s);
			a.setName("A");
			ThreadAA aa = new ThreadAA(s);
			aa.setName("AA");
			a.start();
			aa.start();
			Thread.sleep(100);
			
			ThreadB b = new ThreadB(s);
			b.setName("B");
			ThreadBB bb = new ThreadBB(s);
			bb.setName("BB");
			b.start();
			bb.start();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
