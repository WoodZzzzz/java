package thread.chapter3.s1.section13;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class Run {
	public static void main(String[] args) {
		try {
			ReadData read = new ReadData();
			WriteData write = new WriteData();

			PipedReader input = new PipedReader();
			PipedWriter output = new PipedWriter();

			input.connect(output);
			ReadThread readThread = new ReadThread(read, input);
			readThread.start();
			
			Thread.sleep(2000);
			
			WriteThread writeThread = new WriteThread(write, output);
			writeThread.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
