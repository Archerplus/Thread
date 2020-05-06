package t6;

public class Run2 {
	public static void main(String[] args) {
		MyThread mythread = new MyThread();
		mythread.start();
		//MyThreadl欸的构造函数是被main线程调用的,
		//而run方法是被名称为Thread-0的线程调用的,run方法是自动调用的方法
	}
}
