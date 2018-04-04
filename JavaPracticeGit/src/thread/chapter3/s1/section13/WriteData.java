package thread.chapter3.s1.section13;

import java.io.IOException;
import java.io.PipedWriter;

public class WriteData {

	public void writeMethod(PipedWriter out) {
		try {
			System.out.println("write : ");
			for (int i = 0; i < 30000000; i++) {
				String outData = "" + (i + 1);
				out.write(outData);
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
