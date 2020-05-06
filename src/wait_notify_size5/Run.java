package wait_notify_size5;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		Object lock = new Object();
		ThreadA a = new ThreadA(lock);
		ThreadB b = new ThreadB(lock);
		a.start();
		Thread.sleep(50);
		b.start();
	}
}
