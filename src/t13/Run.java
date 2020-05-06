package t13;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		MyThread thread = new MyThread();
		thread.start();
		Thread.sleep(10);
		thread.interrupt();
		System.out.println("end");
	}
}
