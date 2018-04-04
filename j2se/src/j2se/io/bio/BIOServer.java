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
			System.out.println("BIO服务已启动， 监听端口是：" + port);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void listener() {
		while (true) {
			Socket client;
			try {
				//等待客户端连接
				client = server.accept();
				
				//拿到输入流
				InputStream in = client.getInputStream();
				
				//数据缓存区，只能自己使用
				byte[] buff = new byte[1024];
				int len = in.read(buff);
				String msg = "";
				if (len > 0) {
					msg = new String(buff, 0, len, "utf-8");
				}
				System.out.println("收到 client ：" + msg);
				
				
				OutputStream out = client.getOutputStream();
				out.write("收到:".getBytes("utf-8"));
			} catch (IOException e) {
				e.printStackTrace();
			} //阻塞方法
			
		}
	}
	
	public static void main(String[] args) {
		new BIOServer(8081).listener();;
	}
}
