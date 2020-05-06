package t13;

public class MyThread extends Thread {
	@Override
	public void run() {
		try {
			for (int i = 0; i < 500000; i++) {
				if (this.interrupted()) {
					System.out.println("已经是中断状态了!我要退出了!");
					throw new InterruptedException();
				}
				System.out.println("i = " + (i + 1));
			}
			System.out.println("我被输出,如果此代码是for又继续运行,线程并为停止");
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}
