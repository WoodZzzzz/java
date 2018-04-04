package thread4_currentThread;

public class CountTest2 {
	public static void main(String[] args) {
		CountOperate2 c = new CountOperate2();
		System.out.println("c = " + c);
		Thread t = new Thread(c);
		System.out.println("t = " + t);
		System.out.println("main begin t isAlive = " + t.isAlive());
		t.setName("A");
		t.start();
		/* 加上休眠可以让t.isAlive变为false
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		System.out.println("main end t isAlive = " + t.isAlive());
	}
}
