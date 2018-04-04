package thread5_sleep;

public class Test2 {

	public static void main(String[] args) {
		try {
			MyThread2 thread = new MyThread2();
			thread.start();
			Thread.sleep(1000); //让thread线程执行1秒钟再中断
			thread.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
