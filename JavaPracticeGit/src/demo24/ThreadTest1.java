package demo24;

public class ThreadTest1 {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new PrintChar('c', 100));
		thread1.start();
	}

}
class PrintChar implements Runnable{

	private int times;
	private char c;
    public PrintChar(char c, int times){
    	this.times = times;
    	this.c = c;
    }
    
	
	@Override
	public void run() {
		Thread thread2 = new Thread(new PrintNum(100));
		thread2.start();
		try {
			for (int i = 0; i < times; i++){
				System.out.print(c);
				if(i == 10)thread2.join();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
class PrintNum implements Runnable{
	
	private int num;
	public PrintNum(int num){
		this.num = num;
	}
	
	public void run(){
		for(int i = 0; i < num; i++){
			System.out.print(" "+i);
		}
	}
}