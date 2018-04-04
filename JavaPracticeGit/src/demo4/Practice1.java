package demo4;

public class Practice1 {

	/**
	 * @描述: 
	 * @作者: Administrator
	 * @创建日期: 2017年8月17日 下午9:12:18
	 * @param args
	 */
	public static void main(String[] args) {
		loop1();
		loop2();
		loop3();
		loop4();
		calculateTuition();
	}

	public static void loop1() {
		int i = 5;
		while (i >= 1) {
			int num = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(num + "xxx");
				num += 2;
			}
			System.out.println();
			i--;
		}
	}
	
	public static void loop2() {
		int i = 0; 
		while (i < 5) {
			for (int j = i; j > 1; j--){
				System.out.print(j + " ");
			}
			System.out.println("****");
			i++;
		}
	}

	public static void loop3() {
		int i = 5;
		while (i >= 1) {
			int num = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(num + "xxx");
				num *= 2;
			}
			System.out.println();
			i--;
		}
	}
	
	public static void loop4() {
		int i = 1;
		do {
			int num = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(num + "G");
				num += 2;
			}
			
			System.out.println();
			i++;
		} while (i <= 5);
	}
	
	public static void calculateTuition() {
		double tuition = 10000D;
		double sum = 10000D;
		double increase = 0D;
		for (int i = 0; i < 10; i++) {
			increase = tuition * 0.05;
			sum += (increase + 10000);
			tuition = increase + 10000;
			System.out.println("第 " + (i + 1) + "年的学费是" + tuition + "，多增加了" + increase);
		}
		System.out.println(sum);
	}
	
}
