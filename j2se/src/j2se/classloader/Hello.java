package j2se.classloader;

public class Hello {

	
	
	static int i = stat();
	
	public static int stat() {
		System.out.println("static����" + i);
		return 5;
	}
	
	int j = 2;
	
	int k = prin();
	
	public static void main(String[] args) {
//		System.out.println(args[0]);
		Hello h = new Hello();
		//(k=0)
		//
	}
	
	
	private int prin() {
		System.out.println("prin����" + k);
		return 3;
	}

	{
		print("�����");
	}
	
	public void print(String name) {
		System.out.println("print����");
	}
	
	public Hello() {
		System.out.println("�޲ι��췽��" + k);
		System.out.println(j + "," + i + "," + k);
	}
	
	public Hello(int i) {
		System.out.println("�вι��췽��" + k);
		System.out.println(j + "," + i + "," + k);
	}
	
	static {
		i = 2;
	}
}
