package thread.chapter3.s1.section14;

public class Run {

	public static void main(String[] args) {
		PrintTools tool = new PrintTools();
		for (int i = 0; i < 10; i++) {
			PrintAThread a = new PrintAThread(tool);
			PrintBThread b = new PrintBThread(tool);
			a.start();
			b.start();
		}
	}
}
