package runnable5_atomic;

public class Run2 {
	public static void main(String[] args) {
		try {
			MyService service = new MyService();
			MyThread2[] my = new MyThread2[5];
			for (int i = 0; i < my.length; i++) {
				my[i] = new MyThread2(service);
			}

			for (int i = 0; i < my.length; i++) {
				my[i].start();
			}
			Thread.sleep(1000);
			System.out.println(service.aiRef.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
