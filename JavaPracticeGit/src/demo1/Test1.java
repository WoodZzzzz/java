package demo1;

public class Test1 {

	public static void main(String[] args) {
		int i = 171;
		String j = Integer.toBinaryString(i);
		System.out.println(j);

		System.out.println(56 % 6); //2
		System.out.println(78 % -4); //2
		System.out.println(-34 % 5);  //-4
		System.out.println(-34 % -5); //-4
		System.out.println(5 % 1); //0
		System.out.println(1 % 5); //1
		
		
		System.out.println(56 / 6); //9
		System.out.println(78 / -4); //-19
		System.out.println(-34 / 5);  //-6
		System.out.println(-34 / -5); //6
		System.out.println(5 / 1); //5
		System.out.println(1 / 5 + "\\"); //0
		
		char c = 'A';
		int n = c;
		
		float f = 100.34f;
		int m = (int)f;
		
		System.out.println(1 + "Welcome" + 1 + 1);
		System.out.println(1 + "Welcome" + ('\u0001' + 1));
	}
}
