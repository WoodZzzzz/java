package runnable2_safe;

public class ALogin extends Thread {

	public ALogin(String name) {
		this.setName(name);
	}

	@Override
	public void run() {
		LoginServlet.doPost("a", "aaa");
	}
}

class BLogin extends Thread {
	public BLogin(String name) {
		this.setName(name);
	}

	@Override
	public void run() {
		LoginServlet.doPost("b", "bbb");
	}
}
