package thread14_innerClass;

public class PublicClass {

	private String username;
	private String password;

	class PrivateClass {
		private String age;
		private String address;
		
		public void setAge(String a) {
			age = a;
		}
		
		public String getAge() {
			return age;
		}
		
		public void setAddress(String addr) {
			address = addr;
		}
		
		public String getAddress() {
			return address;
		}
		
		public void printString() {
			System.out.println(username + " : " + password);
		}
	}
	
	static class PrivateStaticClass {
		private String age;
		private String address;
		
		public void setAge(String a) {
			age = a;
		}
		
		public String getAge() {
			return age;
		}
		
		public void setAddress(String addr) {
			address = addr;
		}
		
		public String getAddress() {
			return address;
		}
		
	}

	public void setUsername(String name) {
		username = name;
	}

	public String getUsername() {
		return username;
	}

	public void setPassword(String pwd) {
		password = pwd;
	}

	public String getPassword() {
		return password;
	}
}
