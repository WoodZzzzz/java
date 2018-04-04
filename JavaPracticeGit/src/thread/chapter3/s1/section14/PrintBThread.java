package thread.chapter3.s1.section14;

public class PrintBThread extends Thread {

	private PrintTools tool;
	
	public PrintBThread(PrintTools tool) {
		this.tool = tool;
	}
	
	public void run() {
		tool.printB();
	}
}
