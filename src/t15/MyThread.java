package t15;

public class MyThread extends Thread {
	@Override
	public void run() {
		try {
			for (int i = 0; i < 100; i++) {
				System.out.println("i = " + i);
			}
			System.out.println("run begin");
			Thread.sleep(2000000);
			System.out.println("run end");
		} catch (InterruptedException e) {
			System.out.println("先停止,再遇到了sleep!,进入catch");
			e.printStackTrace();
		}

	}
}
