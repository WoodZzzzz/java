package test;

public class Gender {

	private String description;
	private static final Gender male = new Gender("��");
	private static final Gender female = new Gender("Ů");

	private Gender(String description) {
		this.description = description;
	}

	public static Gender getMale() {
		return male;
	}

	public static Gender getFemale() {
		return female;
	}

	public String getDescription() {
		Test t = new Test();
		t.a();
		
		return description;
	}

}
