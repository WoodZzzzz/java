package demo4;

import java.util.LinkedList;

public class Lesson1 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		/*
		 * while (i < 4) { if (i % 3 == 0) continue; sum += i; i++; }
		 * System.out.println(sum);
		 */

		while (i < 4) {
			if (i % 3 == 0) {
				i++;
				continue;
			}
			sum += i;
			i++;
		}
		System.out.println(sum);

		int[] arr = { 1, 2, 3, 4 };
		String str = "111";
		modify(arr);
		System.out.println(arr[0]);
		System.out.println(str);
	}

	public static void modify(int[] arr) {
		arr[0] = 111;
	}
	
	public static void modifyStr(String str) {
		str = "123";
	}
}
