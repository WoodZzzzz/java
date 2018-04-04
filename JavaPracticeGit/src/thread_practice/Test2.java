package thread_practice;

public class Test2 {

	public static void main(String[] args) {
		Main main = new Main();
		main.start();
	}
}

class Main extends Thread {

	public void run() {
		for (int i = 0; i < 50; i++) {
			printStr();
			System.out.println("µÚ" + (i + 1) + "´Î");
		}
	}

	public synchronized void printStr() {
		for (int i = 0; i < 10; i++) {
			System.out.println("i");
		}
		printInt();
	}

	public synchronized void printInt() {
		for (int j = 0; j < 100; j++) {
			System.out.println("99");
		}
	}
}
