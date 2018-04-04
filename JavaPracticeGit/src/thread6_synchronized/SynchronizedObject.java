package thread6_synchronized;

public class SynchronizedObject {
	private String name = "a";
	private String pwd = "aa";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public synchronized void printString(String a, String b) {
		try {
			name = a;
			Thread.sleep(20000);
			pwd = b;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
