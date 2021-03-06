package Fair_noFair_test;

public class RunFair {
	public static void main(String[] args) {
		final Service service = new Service(true);
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
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
//打印的结果基本是呈有序的状态
//这就是公平锁的特点