package extthread;

import controller.LoginServlet;

public class BLogin extends Thread{

	public void run(){
		LoginServlet.doPost("b", "bb");
	}

}
