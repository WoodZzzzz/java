package thread_practice.loopPrint;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			Printer p = new Printer();
			Thread1 t1 = new Thread1(p);
			t1.setName("A");
			t1.start();
			Thread2 t2 = new Thread2(p);
			t2.setName("B");
			t2.start();
			Thread3 t3 = new Thread3(p);
			t3.setName("C");
			t3.start();
			Thread.sleep(1000);
		}
	}

}

class Printer {

	public void printStringA() {
		synchronized (this) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	
	public void printStringB() {
		synchronized (this) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	
	public void printStringC() {
		synchronized (this) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}


class Thread1 extends Thread {
	private Printer printer;

	public Thread1(Printer p) {
		printer = p;
	}

	public void run() {
		printer.printStringA();
	}
}

class Thread2 extends Thread {
	private Printer printer;

	public Thread2(Printer p) {
		printer = p;
	}

	public void run() {
		printer.printStringB();
	}
}

class Thread3 extends Thread {
	private Printer printer;

	public Thread3(Printer p) {
		printer = p;
	}

	public void run() {
		printer.printStringC();
	}
}


