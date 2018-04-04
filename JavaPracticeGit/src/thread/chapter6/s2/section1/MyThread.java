package thread.chapter6.s2.section1;

public class MyThread extends Thread {

	public void run() {
		System.out.println(MyObject.getInstance().hashCode());
	}
}
