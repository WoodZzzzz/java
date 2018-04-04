package thread.chapter3.s1.section14;

public class PrintAThread extends Thread {

	private PrintTools tool;
	
	public PrintAThread(PrintTools tool) {
		this.tool = tool;
	}
	
	public void run() {
		tool.printA();
	}
}
