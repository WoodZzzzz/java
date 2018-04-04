package j2se.concurrent.conference;

public class Test {

	public static void main(String[] args) {
		VideoConference vp = new VideoConference(10);
		Thread con = new Thread(vp);
		con.start();
		Thread[] t = new Thread[10];
		for (int i = 0; i < 10; i++) {
			t[i] = new Thread(new Participants("p" + (i + 1), vp));
		}
		for (int i = 0; i < 10; i++) {
			t[i].start();
		}
	}
}
