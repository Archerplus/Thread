package t11;

public class Run {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		try {
			Thread.sleep(2000);
			//�����еĽ������  interrupt()������û��ֹͣ�߳�
			mt.interrupt();
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
	}
}
