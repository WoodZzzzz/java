package thread.chapter1.section2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Test {

	private static List<FileVO> list = new ArrayList<FileVO>();

	public static void main(String[] args) {
		File file = new File(
				"D:\\develop\\gitworkspace2\\JavaPracticeGit\\src\\thread\\chapter3\\s1");
		getFile(file);

		for (int i = 0; i < list.size(); i++) {
			FileVO f = new FileVO();
			f = list.get(i);
			File file1 = new File(f.getPath() + f.getFileName());
			File file2 = new File("E" + f.getPath().substring(1) + f.getFileName());
			if (!file2.getParentFile().exists()) {
				file2.getParentFile().mkdirs();
			}
			try {
				file2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			BufferedReader input = null;
			PrintWriter out = null;
			try {
				input = new BufferedReader(new InputStreamReader(new FileInputStream(file1)));
			

				List list2 = new ArrayList();
				String str = input.readLine();
				while (str != null) {
					int index = str.indexOf("chapter3");
					if(index != -1) {
						str = str.replace("chapter3", "chapter3.s1");
					}
					list2.add(str);
					str = input.readLine();
				}
				
				out = new PrintWriter(file2);
				for (int j = 0; j < list2.size(); j++) {
					String str2 = (String) list2.get(j);
					out.println(str2);
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					input.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				out.close();
			}
		}
	}

	public static void getFile(File file) {

		if (file.exists()) {
			if (file.isDirectory()) {
				// System.out.println(file);
				File[] files = file.listFiles();
				for (File one : files) {
					getFile(one);
				}
			} else {
				// list.add(file.toString());
				String path = file.getAbsolutePath();
				int endIndex = path.lastIndexOf("\\");
				String prex = path.substring(0, endIndex + 1);
				String fileName = path.substring(endIndex + 1);
				FileVO f = new FileVO();
				f.setPath(prex);
				f.setFileName(fileName);
				list.add(f);
			}
		}
	}

}

class FileVO {

	private String path;
	private String fileName;

	public void setPath(String path) {
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}
}
