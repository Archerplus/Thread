package t7;

public class Run {
	public static void main(String[] args) {
		
//		MyThread mythread = new MyThread();
//		System.out.println("begin = " + mythread.isAlive());
//		mythread.start();
		//虽然end == true,最后打印的值为true,
		//但事实上mythread.isAlive()的值是不确定的
//		System.out.println("end = " + mythread.isAlive());
		
//		MyThread mythread = new MyThread();
//		System.out.println("begin = " + mythread.isAlive());
//		mythread.start();
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		//结果为end == false, 因为mythread线程已经在一秒内执行完毕
//		System.out.println("end == " + mythread.isAlive());
		
		CountOperate c = new CountOperate();
		Thread t1 = new Thread(c);
		System.out.println("main begin t1 isAlive = " + t1.isAlive());
		t1.setName("A");
		t1.start();
		System.out.println("main end t1 isAlive = " + t1.isAlive());
	}
}
