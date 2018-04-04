package thread_practice;

public class Test1 {
	public static void main(String[] args) {
		PrintString a = new PrintString();
		new Thread(a, "1").start();
		new Thread(a, "2").start();
		new Thread(a, "3").start();
		new Thread(a, "4").start();
		new Thread(a, "5").start();
		new Thread(a, "6").start();
		new Thread(a, "7").start();
		new Thread(a, "8").start();
		new Thread(a, "9").start();
		new Thread(a, "10").start();
	}
}
