package semaphoreStudy;

import java.util.concurrent.*;

public class Main {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		final Semaphore semaphore = new Semaphore(5);
		for (int index = 0; index < 20; index++) {
			final int NO = index;
			Runnable runnable = new Runnable() {
				
				@Override
				public void run() {
					try {
						semaphore.acquire();
						System.out.println("Accessing: " + NO);
						Thread.sleep(2000);
						semaphore.release();
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~" + semaphore.availablePermits());
					}catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			executorService.execute(runnable);
		}
		executorService.shutdown();
	}
}
