package thread4_currentThread;

public class CountOperate2 extends Thread {

	public CountOperate2() {
		System.out.println("CountOperate2 -- begin");
		System.out.println("Thread.currentThread.getName() = "
				+ Thread.currentThread().getName());
		System.out.println("Thread.currentThread.isAlive() = "
				+ Thread.currentThread().isAlive());
		System.out.println("this.getName() = " + this.getName());
		System.out.println("this.isAlive() = " + this.isAlive());
		System.out.println("this = " + this);  //this��ʾ���ø÷����������������
		System.out.println("CountOperate2 -- end");
	}

	@Override
	public void run() {
		System.out.println("run -- begin");
		System.out.println("Thread.currentThread.getName() = "
				+ Thread.currentThread().getName());
		System.out.println("Thread.currentThread.isAlive() = "
				+ Thread.currentThread().isAlive());
		System.out.println("this.getName() = " + this.getName());
		System.out.println("this.isAlive() = " + this.isAlive());
		System.out.println("this = " + this);  //this��ʾ���ø÷����������������   // Ϊʲô��c������t,c��Ϊ����������ݸ�Thread�࣬this�൱�������������ã�c���ӣ� t������
		System.out.println("run -- end");
	}
}
