package join;

public class JoinCountDownLatchTest {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "执行完成");
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				try {
					Thread.sleep(1000);
					System.out.println(Thread.currentThread().getName() + "执行完成");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t1.start();
//		t2.start();
		t1.join();
//		t2.join();
		System.out.println("所有执行完成");
	}
}
