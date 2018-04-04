package j2se.serializable;

import static j2se.serializable.StaticClass.println;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int age = 6;
	private String name = "Wood";
	private static int staticVar = 5;

	public static void main(String[] args) {
		println();
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(
					"result.obj"));
			out.writeObject(new Test());
			out.close();
			
			Test.staticVar = 10;
			
			
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream("result.obj"));
			Test t = (Test)oin.readObject();
			oin.close();
			
			System.out.println(t.staticVar);
			System.out.println(t.age);
			System.out.println(t.name);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
