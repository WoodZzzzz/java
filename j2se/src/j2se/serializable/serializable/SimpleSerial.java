package j2se.serializable.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SimpleSerial {

	public static void main(String[] args) {
		File file = new File("person.out");
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
			Person p = new Person(Gender.MALE, "Wood", 25, 15000);
			out.writeObject(p);
			out.close();
			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			Person person = (Person)ois.readObject();
			ois.close();
			System.out.println(person);
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
