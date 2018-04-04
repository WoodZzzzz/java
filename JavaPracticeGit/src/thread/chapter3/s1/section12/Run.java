package thread.chapter3.s1.section12;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Run {
	public static void main(String[] args) {
		try {
			WriteData write = new WriteData();
			ReadData read = new ReadData();

			PipedOutputStream outputStream = new PipedOutputStream();
			PipedInputStream inputStream = new PipedInputStream();

			outputStream.connect(inputStream);
//			inputStream.connect(outputStream);
			ReadThread readThread = new ReadThread(read, inputStream);
			readThread.start();
			
			Thread.sleep(20000);
			
			WriteThread writeThread = new WriteThread(write, outputStream);
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
