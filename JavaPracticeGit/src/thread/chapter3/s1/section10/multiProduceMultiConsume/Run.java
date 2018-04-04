package thread.chapter3.s1.section10.multiProduceMultiConsume;

public class Run {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		Producer p = new Producer(stack);
		Producer p2 = new Producer(stack);
		Producer p3 = new Producer(stack);
		Producer p4 = new Producer(stack);
		ThreadP tp = new ThreadP(p);
		ThreadP tp2 = new ThreadP(p2);
		ThreadP tp3 = new ThreadP(p3);
		ThreadP tp4 = new ThreadP(p4);
		tp.start();
		tp2.start();
		tp3.start();
		tp4.start();
		
		Consumer c = new Consumer(stack);
		Consumer c2 = new Consumer(stack);
		Consumer c3 = new Consumer(stack);
		Consumer c4 = new Consumer(stack);
		ThreadC tc = new ThreadC(c);
		ThreadC tc2 = new ThreadC(c2);
		ThreadC tc3 = new ThreadC(c3);
		ThreadC tc4 = new ThreadC(c4);
		tc.start();
		tc2.start();
		tc3.start();
		tc4.start();
	}
}
