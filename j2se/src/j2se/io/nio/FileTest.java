package j2se.io.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileTest {
	
	public static void main(String[] args) throws IOException {
		String infile = "D:\\develop\\workspace\\j2se\\FileTestin.java";
		String outfile = "D:\\develop\\workspace\\j2se\\FileTestout.java";
		
		FileInputStream in = new FileInputStream(infile);
		FileOutputStream out = new FileOutputStream(outfile);
		
		FileChannel fcIn = in.getChannel();
		FileChannel fcOut = out.getChannel();
		
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		while (true) {
			buffer.clear();
			if (fcIn.read(buffer) == -1) {
				break;
			}
			buffer.flip();
			fcOut.write(buffer);
		}
	}	
	
}
