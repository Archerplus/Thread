package t11;

public class Run {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		try {
			Thread.sleep(2000);
			//从运行的结果来看  interrupt()方法并没有停止线程
			mt.interrupt();
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
	}
}
