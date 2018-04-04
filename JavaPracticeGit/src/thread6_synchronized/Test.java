package thread6_synchronized;

public class Test {

	public static void main(String[] args) {
		SynchronizedObject sync = new SynchronizedObject();
		MyThread thread = new MyThread(sync);
		try {
			thread.start();
			thread.sleep(500);
			thread.stop();
			System.out.println(sync.getName() + " " + sync.getPwd());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
