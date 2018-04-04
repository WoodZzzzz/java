package thread.chapter3.s1.section13;

import java.io.IOException;
import java.io.PipedReader;

public class ReadData {

	public void readMethod(PipedReader input) {
		try {
			System.out.println("read : ");
			char[] byteArray = new char[10];
			int readLength = input.read(byteArray);
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
