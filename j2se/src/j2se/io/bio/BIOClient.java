package j2se.io.bio;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class BIOClient {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			
			Socket client = new Socket("localhost", 8081);
			OutputStream os = client.getOutputStream();
			String random = sc.nextLine();
			os.write(random.getBytes("utf-8"));
			client.shutdownOutput();
			System.out.println("客户端端已关闭输出流");
			InputStream in = client.getInputStream();
			byte[] bytes = new byte[1024];
			int len;
			StringBuilder sb = new StringBuilder();
			while ((len = in.read(bytes)) != -1) {
				sb.append(new String(bytes, 0, len, "utf-8"));
			}

			try {
				Thread.sleep(100000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			os.close();
			in.close();
			client.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
