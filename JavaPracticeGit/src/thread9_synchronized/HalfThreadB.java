package thread9_synchronized;

public class HalfThreadB extends Thread {

	private HalfAsyncHalfSync haObj;
	
	public HalfThreadB(HalfAsyncHalfSync obj) {
		haObj = obj;
	}
	
	public void run() {
		haObj.printString();
	}
}
