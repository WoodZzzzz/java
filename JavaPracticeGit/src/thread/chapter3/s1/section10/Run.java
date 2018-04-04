package thread.chapter3.s1.section10;

public class Run {
	public static void main(String[] args) {
		try {
			Object obj = new Object();
			Substract s1 = new Substract(obj);
			Substract s2 = new Substract(obj);
			ThreadSubstract t1 = new ThreadSubstract(s1);
			ThreadSubstract t2 = new ThreadSubstract(s2);
			t1.setName("sub1");
			t1.start();
			t2.setName("sub2");
			t2.start();
			Thread.sleep(1000);
			Add a = new Add(obj);
			ThreadAdd t3 = new ThreadAdd(a);
			t3.setName("add1");
			t3.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
