package thread.chapter4.s1.section7;

public class ThreadA extends Thread {

	private Printer printer;

	public ThreadA(Printer printer) {
		this.printer = printer;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			printer.printA();
		}
	}
}

class ThreadB extends Thread {

	private Printer printer;

	public ThreadB(Printer printer) {
		this.printer = printer;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			printer.printB();
		}
	}
}

