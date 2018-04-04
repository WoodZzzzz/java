package thread.chapter6.s1;

public class MyThread extends Thread {

	public void run() {
		System.out.println(MyObject.getInstance().hashCode());
	}
}
