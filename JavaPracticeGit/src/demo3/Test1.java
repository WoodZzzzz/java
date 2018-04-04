package demo3;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println("Is " + i + " divisible by 5 and 6?" + (i % 5 == 0 && i % 6 == 0));
		System.out.println("Is " + i + " divisible by 5 or 6?" + (i % 5 == 0 || i % 6 == 0));
//		System.out.println("Is " + i + " divisible by 5 or 6, but not both?" + );
	}

}
