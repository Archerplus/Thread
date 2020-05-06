package t7;

public class MyThread1 extends Thread{
	@Override
	public void run() {
		System.out.println("run threadName = " + this.currentThread().getName() + "begin");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("run threadName = " + this.currentThread().getName() + "end");
	}
}
