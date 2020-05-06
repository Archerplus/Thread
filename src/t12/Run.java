package t12;

public class Run {
	public static void main(String[] args) throws InterruptedException {
//		MyThread thread = new MyThread();
//		thread.start();
		//使当前线程睡眠
//		Thread.sleep(10000);
//		thread.interrupt();
		//测试当前线程是否已经中断
		//当前线程是main,所以一直都没有中断
//		System.out.println("是否停止 1? = " + thread.interrupted());
//		System.out.println("是否停止 2? = " + thread.interrupted());
//		System.out.println("end");
		
		
		Thread.currentThread().interrupt();
		System.out.println("是否停止 1? = " + Thread.interrupted());
		System.out.println("是否停止 2? = " + Thread.interrupted());
		System.out.println("end");
		
	}
}
