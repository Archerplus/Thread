package test2;

public class Demo1 {
	public static void main(String[] args) {
		Thread thread = new Thread();
//		Thread.currentThread().interrupt();
		thread.interrupt();
		System.out.println("当前线程是否已经停止" 
	+ thread.interrupted());
		System.out.println("当前线程是否已经停止" + thread.interrupted());
		
	}
}

//判断当前线程是否已经停止
//interrupted() 静态方法
//会清除中断状态
//isInterrupted() 不是静态方法
//不会清楚中断状态