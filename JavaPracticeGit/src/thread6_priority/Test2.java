package thread6_priority;

public class Test2 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			MyThreadA2 ma = new MyThreadA2();
			ma.setPriority(10);
			ma.start();

			MyThreadB2 mb = new MyThreadB2();
			mb.setPriority(1);
			mb.start();
		}
	}
}
