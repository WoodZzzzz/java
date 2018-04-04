package thread5_sleep;

public class MyThread1 extends Thread {

	@Override
	public void run() {
		try {
			System.out.println("run threadName = "
					+ this.currentThread().getName() + " begin");   //返回当前执行线程的名称
			Thread.sleep(2000);
			System.out.println("run threadName = "
					+ this.currentThread().getName() + " end");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
