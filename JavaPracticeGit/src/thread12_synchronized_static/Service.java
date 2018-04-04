package thread12_synchronized_static;

public class Service {

	public synchronized static void printA() {
		try {
			System.out.println("线程名称为：" + Thread.currentThread().getName()
					+ "在" + System.currentTimeMillis() + "进入printA");
			Thread.sleep(4000);
			System.out.println("线程名称为：" + Thread.currentThread().getName()
					+ "在" + System.currentTimeMillis() + "离开printA");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public synchronized static void printB() {
		System.out.println("线程名称为：" + Thread.currentThread().getName() + "在"
				+ System.currentTimeMillis() + "进入printB");
		System.out.println("线程名称为：" + Thread.currentThread().getName() + "在"
				+ System.currentTimeMillis() + "离开printB");
	}
}
