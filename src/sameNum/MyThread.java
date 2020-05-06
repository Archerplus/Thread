package sameNum;

public class MyThread extends Thread{
	private int i = 5;
	@Override
	public void run() {
		System.out.println("i = " + i-- + " threadNam = " + Thread.currentThread().getName());
		//注意,代码i--由前面项目中单独一行运行改成在当前项目中在println()方法中直接打印
	}
	//虽然println()方法在内部是同步的,但i--的操作却是在进入Println()之前发生的,所以有发生非线程安全问题的概率
}
