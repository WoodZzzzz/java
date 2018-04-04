package interruptMethod;

import org.apache.log4j.Logger;

public class SynchronizedObject6 {

	private static Logger logger = Logger.getLogger(SynchronizedObject6.class);

	private String username = "a";

	private String password = "aa";

	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() { 
		return password;
	}
	
	public void setPassword() {
		this.password = password;
	}
	
	public synchronized void printString(String username, String password) {
		try {
			this.username = username;
			Thread.sleep(10000);
			this.password = password;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
