package inheritableThreadLocal2;

public class ThreadA extends Thread{
	@Override
	public void run() {
		try {
			for(int i = 0;i < 10;i++) {

				System.out.println("��threadA�߳���ȡֵ = " + Tools.t1.get());
				Thread.sleep(100);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
