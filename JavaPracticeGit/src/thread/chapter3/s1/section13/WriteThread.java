package thread.chapter3.s1.section13;

import java.io.PipedWriter;

public class WriteThread extends Thread {

	private WriteData write;
	private PipedWriter output;
	
	public WriteThread(WriteData write, PipedWriter output) {
		this.write = write;
		this.output = output;
	}
	
	@Override
	public void run() {
		write.writeMethod(output);
	}
}
