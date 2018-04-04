package extthread;

public class MyThread3 extends Thread {
	
	public void run(){
		
		try {
			System.out.println("run threadname="
					+ this.currentThread().getName() + " begin");
			Thread.sleep(2000);
			System.out.println("run threadname="
					+ this.currentThread().getName() + " end");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
