package thread9_synchronized;

public class TaskTest2 {
	public static void main(String[] args) {
		Task2 task = new Task2();
		MyThreadA2 a1 = new MyThreadA2(task);
		a1.setName("A");
		a1.start();
		MyThreadB2 b1 = new MyThreadB2(task);
		b1.setName("B");
		b1.start();
	}
}
