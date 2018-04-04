package thread.chapter7.s5.section1;

public class MyThread extends Thread {

	@Override
	public void run() {
		String username = null;
		System.out.println(username.hashCode());
	}
}
