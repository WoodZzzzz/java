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
	 * @����: ����Բ����
	 * @����: Zhouwj
	 * @��������: 2017��8��21�� ����11:19:21
	 */ 	
	public static void getPI() {
		/**
		 * �� = 4(1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13 .... - 1/(2i-1) + 1/(2i+1));
		 */
		/**
		 * 1��ȷ��i
		 * 2����i=0������i��ֵѭ��
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
	 * @����: ��ӡ������
	 * @����: Zhouwj
	 * @��������: 2017��8��21�� ����11:20:23
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
		 * 1���ȴ�ӡ�ո�
		 * 2���ٴ�ӡ��벿�ֵ�����
		 * 3������ӡ�а벿�ֵ�����
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
	 * @����: ��ȡ���������зֽ�����
	 * @����: Zhouwj
	 * @��������: 2017��8��21�� ����11:22:12
	 */
	public static void getPrimeFator() {
		/*
		 * ���������Ӳ��裺
		 * 1������2ȥ�����õ���������
		 * 2������ʣ�ಿ�ּ���ȥ����2
		 * 3��ֱ�����ܱ�����Ϊֹ
		 */
		while (true) {
			Scanner in = new Scanner(System.in);
			int prime = in.nextInt();
			if (prime <= 1) {
				System.out.println("������ķ�����");
				return;
			}
			if (prime == 2 || prime == 3) {
				System.out.println(prime + "��������������");
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
