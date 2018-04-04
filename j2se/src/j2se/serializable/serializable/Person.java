package j2se.serializable.serializable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectInputStream.GetField;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.ObjectOutputStream.PutField;
import java.io.Serializable;

public class Person extends LivingThings implements Externalizable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Gender gender = null;
	private String name = null;
	private Integer age = null;
	private transient Integer salary = null;
	
	public Person() {
		
	}
	
	public Person(Gender gender, String name, Integer age, Integer salary) {
		this.gender = gender;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	private void writeObject(ObjectOutputStream out) {
		//一般来说这种写法用在
/*		try {
			PutField putFields = out.putFields();
			putFields.put("age", age);
			putFields.put("name", name);
			putFields.put("gender", gender);
			out.writeFields();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		try {
			out.defaultWriteObject();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void readObject(ObjectInputStream ois) {
		/*GetField getFields;
		try {
			getFields = ois.readFields();
			age = (Integer) getFields.get("age", "");
			name = (String) getFields.get("name", "");
			gender = (Gender) getFields.get("gender", "");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		try {
			ois.defaultReadObject();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String toString() {
		return "[" + gender + "," + name + "," + age + "," + salary + "]";
	}

	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(gender);
		out.writeObject(name);
		out.writeInt(age);
		out.writeInt(salary);
	}

	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		gender = (Gender) in.readObject();
		name = (String) in.readObject();
		salary = (Integer) in.readInt();
		age = (Integer) in.readInt();
		
	}

}
