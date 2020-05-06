package lockMethodTest2;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		final Service service = new Service();
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				service.waitMethod();
			}
		};
		Thread threadA = new Thread(runnable);
		threadA.start();
		Thread.sleep(500);
		Thread threadB = new Thread(runnable);
		threadB.start();
		Thread.sleep(500);
		System.out.println(service.lock.hasQueuedThread(threadA));
		System.out.println(service.lock.hasQueuedThread(threadB));
		System.out.println(service.lock.hasQueuedThreads());
	}
}
//方法boolean hasQueuedThread(Thread thread)的作用是查询指定的线程是否正在等待获取此锁定
//方法boolean hasQueuedThreads()的作用是查询是否有线程正在等待获取此锁定

