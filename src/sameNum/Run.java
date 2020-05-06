package sameNum;

public class Run {
	public static void main(String[] args) {
		MyThread run = new MyThread();
		Thread r1 = new Thread(run);
		Thread r2 = new Thread(run);
		Thread r3 = new Thread(run);
		Thread r4 = new Thread(run);
		Thread r5 = new Thread(run);
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
	}
}
