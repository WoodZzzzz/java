package demo8;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {

	public static void main(String[] args) throws IOException {
		File file = new File("123.jpg");
		if(file.exists()){
			System.out.println("��׼·��:" + file.getCanonicalPath());
			System.out.println("�ļ��ɶ�:" + file.canRead());
			System.out.println("�ļ���д:" + file.canWrite());
			System.out.println("�ļ�����·��:" + file.getAbsolutePath());
			System.out.println("��ȫ·��:" + file.getPath());
//			System.out.println("�޸��ļ���:" + file.renameTo(new File("123.jpg")));
			System.out.println("����޸�����:" + new Date(file.lastModified()));
		}
	}

}
