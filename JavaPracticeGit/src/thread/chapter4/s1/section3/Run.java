package thread.chapter4.s1.section3;

public class Run {
	public static void main(String[] args) {
		MyService service = new MyService();
		ThreadA a = new ThreadA(service);
		a.start();
	}
}
