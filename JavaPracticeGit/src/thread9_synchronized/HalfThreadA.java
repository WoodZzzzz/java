package thread9_synchronized;

public class HalfThreadA extends Thread {

	private HalfAsyncHalfSync haObj;
	
	public HalfThreadA(HalfAsyncHalfSync obj) {
		haObj = obj;
	}
	
	public void run() {
		haObj.printString();
	}
}
