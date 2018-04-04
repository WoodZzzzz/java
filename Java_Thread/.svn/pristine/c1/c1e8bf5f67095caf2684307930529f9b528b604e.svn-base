package thread;

public class MyThread3 extends Thread {
	private int count = 5;

	public MyThread3(String name) {
		super();
		this.setName(name);
	}
	
	public void run(){
		while(count > 0){
			count--;
			System.out.println("当前线程: " + Thread.currentThread().getName() + " count = " + count);
		}
	}
}
