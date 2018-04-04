package thread4_currentThread;

public class Test1 {

	public static void main(String[] args) {
		MyThread mythread = new MyThread();
		mythread.start();
		mythread.run();
	}

}
