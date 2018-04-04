package thread.chapter3.s1.section10.multiConsumSinglePro;

public class Run {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		Producer p = new Producer(stack);
		ThreadP tp = new ThreadP(p);
		tp.start();
		Consumer c = new Consumer(stack);
		Consumer c2 = new Consumer(stack);
		Consumer c3 = new Consumer(stack);
		ThreadC tc = new ThreadC(c);
		ThreadC tc2 = new ThreadC(c2);
		ThreadC tc3 = new ThreadC(c3);
		
		tc.start();
		tc2.start();
		tc3.start();
	}
}
