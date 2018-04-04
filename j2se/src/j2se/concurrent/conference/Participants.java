package j2se.concurrent.conference;

import java.util.concurrent.TimeUnit;

public class Participants implements Runnable {

	private VideoConference p;
	private String name;

	public Participants(String name, VideoConference p) {
		this.p = p;
		this.name = name;
	}

	public void run() {
		long duration = (long) (Math.random() * 10);
		try {
			TimeUnit.SECONDS.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		p.arrive(name);
	}

}
