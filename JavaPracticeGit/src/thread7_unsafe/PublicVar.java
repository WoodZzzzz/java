package thread7_unsafe;

public class PublicVar {

	private String username = "A";
	private String password = "AA";

	public synchronized void methodA(String name, String pwd) {
		try {
			username = name;
			Thread.sleep(4000);
			password = pwd;
			System.out.println("setValue method thread name = "
					+ Thread.currentThread().getName() + " username = "
					+ username + " password = " + password);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void getValue() {
		System.out.println("getValue method thread name = "
				+ Thread.currentThread().getName() + " username = " + username
				+ " password = " + password);
	}
}
