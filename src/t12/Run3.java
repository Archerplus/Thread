package t12;

public class Run3 {
	public static void main(String[] args) throws InterruptedException {
		MyThread thread = new MyThread();
		thread.start();
		Thread.sleep(10000);
		thread.interrupt();
		System.out.println("�Ƿ�ֹͣ1 ? = " + thread.isInterrupted());
		System.out.println("�Ƿ�ֹͣ2 ? = " + thread.isInterrupted());
		System.out.println("end");
	}
}
