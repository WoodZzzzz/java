package runnable2_safe;

public class LoginServlet {
	private static String username;
	private static String password;


	public synchronized static void doPost(String name, String pwd) {
		try {
			username = name;
		/*	System.out.println("sleep before, currentThread="
					+ Thread.currentThread().getName() + ",username="
					+ username);*/
			if (("a").equals(name)) {
//				Thread.sleep(5000);  即使不睡眠 也可能会导致线程不安全
			}
			password = pwd;
			System.out.println("currentThread="
					+ Thread.currentThread().getName() + ", username="
					+ username + ", password=" + password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
