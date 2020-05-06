package t6;

public class CountOperate extends Thread{
	//构造函数是被main线程调用的,run方法是被本线程调用的
	public CountOperate() {
		System.out.println("CountOperate--begin");
		System.out.println("Thread.currentThread().getName = " + Thread.currentThread().getName());
		System.out.println("this.getName = " + this.getName());
		System.out.println("CountOperate---end");
	}
	@Override
	public void run() {
		System.out.println("run--begin");
		System.out.println("Thread.currentThread().getName = " + Thread.currentThread().getName());
		System.out.println("this.getName = " + this.getName());
		System.out.println("run---end");
	}
}
