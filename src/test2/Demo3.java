package test2;

public class Demo3 {
	public static void main(String[] args) throws InterruptedException {
		Mythread thread = new Mythread();
		Thread.sleep(1000);
		thread.start();
		Thread.sleep(1000);
		thread.suspend();
		System.out.println("hello world");
		Thread.sleep(2000);
		System.out.println("main end");
	}
}
class Mythread extends Thread{
	private long i = 0;
	@Override
	public void run() {
		while(true) {
			System.out.println(i);
		}
	}
}