package t7;

public class MyThread2 extends Thread{
	@Override
	public void run() {
		System.out.println("run threadName = " + this.currentThread().getName() + " begin = " + System.currentTimeMillis());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("run threadName = " + this.currentThread().getName() + " end = " + System.currentTimeMillis());
	}
}
