package thread.chapter3.s1.section12;

import java.io.PipedInputStream;

public class ReadThread extends Thread {

	private ReadData read;
	private PipedInputStream input;
	
	public ReadThread(ReadData read, PipedInputStream input) {
		this.read = read;
		this.input = input;
	}
	
	public void run() {
		read.readMethod(input);
	}
}
