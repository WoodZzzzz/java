package thread.chapter3.s1.section12;

import java.io.IOException;
import java.io.PipedInputStream;

public class ReadData {

	public void readMethod(PipedInputStream input) {
		try {
			System.out.println("read: ");
			byte[] byteArray = new byte[10];
			int readLength = input.read(byteArray);
			System.out.println(readLength);
			while (readLength != -1) {
				String newData = new String(byteArray, 0, readLength);
				System.out.print(newData);
				readLength = input.read(byteArray);
			}
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				input.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
