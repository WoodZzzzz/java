package thread7_safe;

public class HashSelfPrivateNum {

	public synchronized void addI(String username) {

		try {
			int num = 0;
			if ("a".equals(username)) {
				num = 100;
				System.out.println("a set over");
				Thread.sleep(2000);
			} else {
				num = 200;
				System.out.println("b set over");
			}
			System.out.println(username + " num = " + num);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
