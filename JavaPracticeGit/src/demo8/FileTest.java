package demo8;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {

	public static void main(String[] args) throws IOException {
		File file = new File("123.jpg");
		if(file.exists()){
			System.out.println("标准路径:" + file.getCanonicalPath());
			System.out.println("文件可读:" + file.canRead());
			System.out.println("文件可写:" + file.canWrite());
			System.out.println("文件绝对路径:" + file.getAbsolutePath());
			System.out.println("完全路径:" + file.getPath());
//			System.out.println("修改文件名:" + file.renameTo(new File("123.jpg")));
			System.out.println("最后修改日期:" + new Date(file.lastModified()));
		}
	}

}
