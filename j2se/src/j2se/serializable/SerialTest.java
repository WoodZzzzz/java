package j2se.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialTest {

	public static void main(String[] args) {
		Parent p = new Son();
		try {
			ObjectOutputStream out = new ObjectOutputStream(
					new FileOutputStream("son.obj"));
			out.writeObject(p);
			out.close();
			
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream("son.obj"));
			Son s = (Son)oin.readObject();
			oin.close();
			System.out.println(s.p1);
			System.out.println(s.p2);
			System.out.println(s.s3);
			System.out.println(s.s4);
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
