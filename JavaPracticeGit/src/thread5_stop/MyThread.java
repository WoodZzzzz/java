package thread5_stop;

import java.util.logging.Logger;

public class MyThread extends Thread {

	Logger l = Logger.getLogger(getClass().getName());
	
	@Override
	public void run() {
		for (int i = 0; i < 50000; i++) {
			l.info("i=" + (i + 1));
		}
	}
}
