package j2se.classloader;

import java.net.URL;

public class BootstrapTest {

	public static void main(String[] args) {
		// ��ȡ��������������ص�ȫ��URL����
        for (URL url : sun.misc.Launcher.getBootstrapClassPath().getURLs()) {
            // ���������������������ص�ȫ��URL
            System.out.println(url.toExternalForm());
        }
	}
}
