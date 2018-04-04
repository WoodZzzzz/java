package thread.chapter3.s1.section4;

public class Test2 {
	public static void main(String[] args) {
		Object obj = new Object();
		ThreadA a = new ThreadA(obj);
		a.start();
		NotifyThread n = new NotifyThread(obj);
		n.start();
		SynNotifyThread s = new SynNotifyThread(obj);
		s.start();
	}
}
