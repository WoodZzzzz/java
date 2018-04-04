package thread.chapter3.s1.section13;

import java.io.PipedReader;

public class ReadThread extends Thread {

	private ReadData read;
	private PipedReader input;
	
	public ReadThread(ReadData read, PipedReader input) {
		this.read = read;
		this.input = input;
	}
	
	public void run() {
		read.readMethod(input);
	}
}
