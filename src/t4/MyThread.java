package t4;

public class MyThread extends Thread{
	private int count = 5;
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		super.run();
//		count--;
//		System.out.println("由 " + this.currentThread().getName() + " 计算.count = " + count);
//	}
	@Override
	synchronized public void run() {
		// TODO Auto-generated method stub
		super.run();
		count--;
		System.out.println("由 " + this.currentThread().getName() + " 计算,count = " + count);
	}
}
