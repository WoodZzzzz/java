package lock;

public class Run {

	public static void main(String[] args) {
		try {
			final SynchronizedObject object = new SynchronizedObject();
			Thread t1 = new Thread(){
				public void run(){
					object.printString();
				}
			};
			t1.setName("a");
			t1.start();
			Thread.sleep(1000);

			Thread t2 = new Thread(){
				public void run(){
					object.printString();
				}
			};
			t2.start();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
