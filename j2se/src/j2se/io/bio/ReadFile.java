package j2se.io.bio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFile {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("F://test.txt");
			BufferedReader read = new BufferedReader(new InputStreamReader(fin));
			String s1 = read.readLine();
			String s2 = read.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
