package demo4;

import java.math.BigDecimal;
import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
//		printPyramid();
//		getPrimeFator();
//		add();
//		getPI();
		int a = 3;
		int b = a;
		a = 4;
		System.out.println(b); //b == 3
		
		int[] m = {1,2,3,4};
		int[] n = m;
		m[0] = 22;
		System.out.println(n[0]); //n == 22;
	}
	
	/**
	 * 
	 * @描述: 计算圆周率
	 * @作者: Zhouwj
	 * @创建日期: 2017年8月21日 上午11:19:21
	 */ 	
	public static void getPI() {
		/**
		 * π = 4(1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13 .... - 1/(2i-1) + 1/(2i+1));
		 */
		/**
		 * 1、确认i
		 * 2、从i=0到设置i的值循环
		 */
		Scanner in = new Scanner(System.in);
		int precision = in.nextInt();
		double pi = 1.0D;
		double temp = 0.0D;
		int flag = -1;
		for (double i = 1; i < precision; i++) {
			temp = flag * (1 / (2 * i + 1));
			pi += temp;  // 1-1/3+1/5 = 2/3 + 1/5 = 10+3/15
			flag *= -1;
		}
		System.out.println("method getPI's result is " + pi * 4);
	}
	
	/**
	 * 
	 * @描述: 打印金字塔
	 * @作者: Zhouwj
	 * @创建日期: 2017年8月21日 上午11:20:23
	 */
	public static void printPyramid() {
		/**
		 * 				1
					1	2	1
				1	2	4	2	1
			1	2	4	8	4	2	1
		1	2	4 	8   16	8	4	2	1
	1	2	4	8	16	32	16	8	4	2	1
1	2	4	8	16	32	64	32	16	8	4	2	1
		 */
		/*
		 * 1、先打印空格
		 * 2、再打印左半部分的数字
		 * 3、最后打印有半部分的数字
		 */
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		for	(int row = 0; row < input; row++) {
			for (int m = input - 1 - row; m > 0; m--) {
				System.out.print("	");
			}
			
			for (int n = 0; n <= row; n++) {
				System.out.print((int) Math.pow(2, n) + "	");
			}
			
			for (int k = row - 1; k >= 0; k--) {
				System.out.print((int) Math.pow(2, k) + "	");
			}
			System.out.println();
		}
	}
	
	/**
	 * 
	 * @描述: 获取素数的所有分解因子
	 * @作者: Zhouwj
	 * @创建日期: 2017年8月21日 上午11:22:12
	 */
	public static void getPrimeFator() {
		/*
		 * 求数字因子步骤：
		 * 1、先用2去除，得到被除部分
		 * 2、再用剩余部分继续去除以2
		 * 3、直到不能被整除为止
		 */
		while (true) {
			Scanner in = new Scanner(System.in);
			int prime = in.nextInt();
			if (prime <= 1) {
				System.out.println("您输入的非素数");
				return;
			}
			if (prime == 2 || prime == 3) {
				System.out.println(prime + "的因子是它本身");
			}
			StringBuffer str = new StringBuffer();
			for (int i = 2; i <= prime;) {
				if (prime % i == 0) {
					str.append(i + ",");
					prime /= i;
					continue;
				}
				i++;
			}
			System.out.println(str.substring(0, str.length() - 1));
		}
	}
	
	public static void add() {
		double a = 1000000000.0D;
		double b = 0.0000000001D;
		System.out.println(b + a);
	}
}
