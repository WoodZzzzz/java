package extthread;

import controller.LoginServlet;

public class ALogin extends Thread {
	public void run(){
		LoginServlet.doPost("a", "aa");
	}
}
