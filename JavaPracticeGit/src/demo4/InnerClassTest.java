package demo4;

public class InnerClassTest {
	public static void main(String[] args) {
		
		Bird b = new Bird() {

			@Override
			public void fly() {
				System.out.println("·É");
			}
			
		};
		
		b.fly();
	}
}

abstract class Bird {
	private String name;

	public String getName() {
		return name;
	}

	public abstract void fly();
}
