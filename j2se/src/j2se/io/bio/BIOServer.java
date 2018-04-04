package j2se.io.bio;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class BIOServer {

	ServerSocket server;
	
	public BIOServer(int port) {
		try {
			server = new ServerSocket(port);
			System.out.println("BIO������������ �����˿��ǣ�" + port);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void listener() {
		while (true) {
			Socket client;
			try {
				//�ȴ��ͻ�������
				client = server.accept();
				
				//�õ�������
				InputStream in = client.getInputStream();
				
				//���ݻ�������ֻ���Լ�ʹ��
				byte[] buff = new byte[1024];
				int len = in.read(buff);
				String msg = "";
				if (len > 0) {
					msg = new String(buff, 0, len, "utf-8");
				}
				System.out.println("�յ� client ��" + msg);
				
				
				OutputStream out = client.getOutputStream();
				out.write("�յ�:".getBytes("utf-8"));
			} catch (IOException e) {
				e.printStackTrace();
			} //��������
			
		}
	}
	
	public static void main(String[] args) {
		new BIOServer(8081).listener();;
	}
}
