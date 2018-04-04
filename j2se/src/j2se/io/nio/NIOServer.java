package j2se.io.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

public class NIOServer {

	private ByteBuffer buffer = ByteBuffer.allocateDirect(1024);

	public static void main(String[] args) {
		new NIOServer().go(8091);
	}

	private void go(int port) {
		try {
			//��ͨ��
			ServerSocketChannel serverChannel = ServerSocketChannel.open();
			//��ͨ������Ϊ������
			serverChannel.configureBlocking(false);
			//��ͨ���еõ�һ��ServerSocket
			ServerSocket socket = serverChannel.socket();
			//��һ����ַ��ServerSocket��
			socket.bind(new InetSocketAddress("mySpace",port));
			//����һ��ѡ����
			Selector selector = Selector.open();
			// ע��ͨ����ѡ������
			serverChannel.register(selector, SelectionKey.OP_ACCEPT);
			System.out.println("ready to connect" + port);
			while (true) {
				//�ȴ�ͨ��׼��IO����-����
				int num = selector.select();
				if (num == 0) {
					continue;
				}
				//�õ�ѡ����������׼���õ�key
				Iterator it = selector.selectedKeys().iterator();
				while (it.hasNext()) {
					SelectionKey key = (SelectionKey) it.next();
					//����Ѿ�������״̬
					if ((key.readyOps() & SelectionKey.OP_ACCEPT) == SelectionKey.OP_ACCEPT) {
						ServerSocketChannel server = (ServerSocketChannel) key.channel();
						SocketChannel channel = server.accept();
						channel.configureBlocking(false);
						channel.register(selector, SelectionKey.OP_READ);
						System.out.println("got connection from " + channel);
					}
					if (key.isReadable()) {
						SocketChannel sc = (SocketChannel) key.channel();
						int count = 0;
						while ((count = sc.read(buffer)) > 0) {
							buffer.flip();
							sc.write(buffer);
							buffer.clear();
						}
						if (count < 0) {
							sc.close();
						}
						System.out.println("readable ");

					}
					it.remove();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
