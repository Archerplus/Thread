package test2;

public class Demo4 {
	public static void print(Object object) throws InterruptedException {
		synchronized (object) {
			while(true) {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(1000);
			}
		}
	}
}
class ThreadA extends Thread{
	private Demo4 demo4;
	@Override
	public void run() {
		try {
			demo4.print(new Object());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public ThreadA(Demo4 demo4) {
		super();
		this.demo4 = demo4;
	}
	
}


class ThreadB extends Thread{
	private Demo4 demo4;
	@Override
	public void run() {
		try {
			demo4.print(new Object());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public ThreadB(Demo4 demo4) {
		super();
		this.demo4 = demo4;
	}
	
}