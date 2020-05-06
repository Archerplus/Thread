package t6;

public class Run1 {
	public static void main(String[] args) {
		//main方法被名为main的线程调用
		System.out.println(Thread.currentThread().getName());
	}
}
