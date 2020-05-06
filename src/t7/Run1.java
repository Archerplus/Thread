package t7;

public class Run1 {
	public static void main(String[] args) {
		MyThread1 mt = new MyThread1();
		System.out.println("begin = " + System.currentTimeMillis());
		mt.run();
		System.out.println("end = " + System.currentTimeMillis());
	}
}
