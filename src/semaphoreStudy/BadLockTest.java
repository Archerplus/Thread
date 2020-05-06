package semaphoreStudy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BadLockTest {
	protected Object obj1 = new Object();
	protected Object obj2 = new Object();
	protected ExecutorService executorService = Executors.newCachedThreadPool();
	protected Task1 test1 = new Task1();
	protected Task2 test2 = new Task2();

	public static void main(String[] args) {
		BadLockTest test = new BadLockTest();
		for (int i = 0; i < 50; i++) {
			test.test1.setCount(i);
			test.test2.setCount(i);
			test.executorService.execute(test.test1);
		}
	}

	class Task1 implements Runnable {

		public int count;

		public void setCount(int count) {
			this.count = count;
		}

		@Override
		public void run() {
			synchronized (obj1) {
				System.out.println("task1得到obj1对象锁" + count);
				synchronized (obj2) {
					System.out.println("task1得到obj2对象锁" + count);
				}
			}
		}

	}

	class Task2 implements Runnable {
		private int count;

		public void setCount(int count) {
			this.count = count;
		}

		@Override
		public void run() {
			synchronized (obj2) {
				System.out.println("task2得到对象锁" + count);
				synchronized (obj1) {
					System.out.println("task2得到对象锁" + count);
				}
			}
		}

	}
}
