package thread10_synchronized;

public class MyTest2 {

	public static void main(String[] args) throws InterruptedException {
		MyOneList2 list = new MyOneList2();
		MyThreadA2 a = new MyThreadA2(list);
		a.setName("A");
		a.start();
		MyThreadB2 b = new MyThreadB2(list);
		b.setName("B");
		b.start();
		Thread.sleep(6000);
		System.out.println(list.getSize());
	}
}
