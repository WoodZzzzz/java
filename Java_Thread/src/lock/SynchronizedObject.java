package lock;

public class SynchronizedObject {
	public synchronized void printString(){
		if(("a").equals(Thread.currentThread().getName())){
			System.out.println("a线程被永远暂停了");
			Thread.currentThread().suspend();
		}
	}
}
