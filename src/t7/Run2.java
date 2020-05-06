package t7;

public class Run2 {
	public static void main(String[] args) {
		MyThread2 mt = new MyThread2();
		System.out.println("begin = " + System.currentTimeMillis());
		mt.start();
		System.out.println("end = " + System.currentTimeMillis());
	}
}
