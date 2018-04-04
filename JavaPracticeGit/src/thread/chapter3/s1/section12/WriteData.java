package thread.chapter3.s1.section12;

import java.io.IOException;
import java.io.PipedOutputStream;

public class WriteData {

	public void writeMethod(PipedOutputStream out) {
		try {
			System.out.println("write: ");
			for (int i = 0; i < 300; i++) {
				String outData = "" + (i + 1);
				out.write(outData.getBytes());
				System.out.print(outData);
			}
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
	}
}
