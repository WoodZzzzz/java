package interruptMethod;

public class Run6 {

	public static void main(String[] args) {
		SynchronizedObject6 so = new SynchronizedObject6();
		MyThread6 my = new MyThread6(so);
		try {
			my.start();
			my.sleep(200);
			my.stop();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(so.getUsername() + "---" + so.getPassword());
		
	}

}
