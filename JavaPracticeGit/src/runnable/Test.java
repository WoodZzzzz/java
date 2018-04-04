package runnable;

public class Test extends Thread {

	public static void main(String[] args) {
		Runnable runnable = new MyRunnable();
		Thread t = new Thread(runnable, "MyRunnable's name");
		t.start();
		System.out.println("ÔËĞĞ½áÊø");
	}
}
