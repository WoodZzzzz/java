package thread.chapter3.s1.section10;

public class Substract {

	private Object obj;

	public Substract(Object obj) {
		this.obj = obj;
	}

	public void substract() {
		try {
			synchronized (obj) {
				// 为什么if改成while，
				// 就不会报错了，原因是：执行完while里面的代码块之后，程序会再次判断while里的条件是否满足。两个线程执行减法，相当于两次循环。
				// （第二个线程执行被唤醒之后，执行完第18行，然后再判断while的条件，发现size=0，于是又回到了循环体里等待了）
				while (ValueObject.list.size() == 0) {
					System.out.println("thread "
							+ Thread.currentThread().getName() + " begin wait");
					obj.wait();
					System.out.println("thread "
							+ Thread.currentThread().getName() + " end wait");
				}
				ValueObject.list.remove(0);
				System.out.println("list长度为" + ValueObject.list.size());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
