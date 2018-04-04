package thread.chapter4.s1.section15;

public class Run2 {

	public static void main(String[] args) {
		try {
			Service service = new Service();
			MyThreadA a = new MyThreadA(service);
			a.start();
			Thread.sleep(2000);
			MyThreadB b = new MyThreadB(service);
			b.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
