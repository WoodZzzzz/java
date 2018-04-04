package thread.chapter3.s1.section10.single;

public class Run {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		Producer p = new Producer(stack);
		Consumer c = new Consumer(stack);
		ThreadC tc = new ThreadC(c);
		ThreadP tp = new ThreadP(p);
		
		tc.start();
		tp.start();
	}
}
