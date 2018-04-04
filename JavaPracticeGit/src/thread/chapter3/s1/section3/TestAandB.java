package thread.chapter3.s1.section3;

public class TestAandB {

	public static void main(String[] args) throws InterruptedException {
		MyList list = new MyList();
		Object obj = new Object();
		MyThreadA a = new MyThreadA(list, obj);
		MyThreadB b = new MyThreadB(list, obj);
		b.start();
		Thread.sleep(50);
		a.start();
	}
}
