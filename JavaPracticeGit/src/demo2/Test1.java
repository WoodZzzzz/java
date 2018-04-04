package demo2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class Test1 {

	/**
	 * 
	 * @描述:
	 * @作者: zwj
	 * @创建日期: 2017年8月16日 下午9:24:50
	 * @param args
	 */
	public static void main(String[] args) {
//		lowerCaseToUppercase();
		String str = "b";
		int i = 10;
		setStr(str,i);
		System.out.println(str);
		System.out.println(i);
		int[] a = new int[4];
		System.out.println(a[0]);
//		ConcurrentHashMap
		System.out.println(i <<= 2 );
	}

	private static void setStr(String str, int i) {
		str = "a";
		i = 12;
	}

	/**
	 * 
	 * @描述:
	 * @作者: Administrator
	 * @创建日期: 2017年8月16日 下午9:24:55
	 */
	public static void lowerCaseToUppercase() {
		String str = "adfjsdfasjldg";
		char[] charArr = str.toCharArray();
		char[] upperArr = new char[str.length()];
		int offset = (int) 'a' - (int) 'A';
		for (int i = 0; i < charArr.length; i++) {
			int temp = (int) charArr[i] - offset;
			char upperOne = (char) temp;
			upperArr[i] = upperOne;
		}
		System.out.println(upperArr);
	}

	/**
	 * 
	 * @描述:
	 * @作者: Administrator
	 * @创建日期: 2017年8月16日 下午9:24:59
	 */
	public void printIntFromInput() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Long[] arr = new Long[str.length()];
		long inputInt = Long.parseLong(str);
		for (int m = 0; m < str.length(); m++) {
			arr[m] = inputInt % 10;
			if (m < str.length() - 1) {
				inputInt /= 10;
			}

		}
		System.out.println(arr.toString());
		for (int n = arr.length - 1; n >= 0; n--) {
			System.out.print(arr[n]);
		}
		/*
		 * int third = i % 10; // 912 % 10 = 2 ; int temp = i / 10; int second =
		 * temp % 10; // 912 / 10 = 91; 91 % 10 = 1; int first = temp / 10;
		 * System.out.println(first + "" + second + third);
		 */
	}
}
