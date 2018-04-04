package j2se.classloader;

import java.net.URL;

public class BootstrapTest {

	public static void main(String[] args) {
		// 获取根类加载器所加载的全部URL数组
        for (URL url : sun.misc.Launcher.getBootstrapClassPath().getURLs()) {
            // 遍历、输出根类加载器加载的全部URL
            System.out.println(url.toExternalForm());
        }
	}
}
