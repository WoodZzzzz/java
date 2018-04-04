package thread.chapter3.s1.section10.multiProduceSingleConsume;

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
		ThreadC tc = new ThreadC(c);
		
		tc.start();
	}
}
