package runnable3_volatile;

public class Test1 {
	public static void main(String[] args) {
		PrintString print = new PrintString();
		new Thread(print).start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("I'm going to stop the thread");
		print.setContinue(false);
//		System.out.println(print.getContinue());
		
	}
}
