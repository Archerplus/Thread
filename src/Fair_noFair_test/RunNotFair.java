package Fair_noFair_test;

public class RunNotFair {
	public static void main(String[] args) {
		final Service service = new Service(false);
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(" & 线程 " + Thread.currentThread().getName() + " 运行了 ");
				service.serviceMethod();
			}
		};
		Thread[] threadArray = new Thread[10];
		for(int i = 0;i < 10;i++) {
			threadArray[i] = new Thread(runnable);
		}
		for(int i = 0;i < 10;i++) {
			threadArray[i].start();
		}
	}
}
//非公平锁的运行结果基本上是乱序的，说明先start()启动的线程不代表先获得锁