package semaphoreStudy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class BadLockSolve {
	protected ExecutorService executorService = Executors.newCachedThreadPool();
	protected Task1 test1 = new Task1();
	protected Task2 test2 = new Task2();
	protected Semaphore s1 = new Semaphore(1);
	protected Semaphore s2 = new Semaphore(1);

	public static void main(String[] args) {
		for (int i = 0; i < 50; i++) {

		}
	}

	class Task1 implements Runnable {
		public int count;

		public void setCount(int count) {
			this.count = count;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				if (s2.tryAcquire(1, TimeUnit.SECONDS)) {
					System.out.println("task1�õ�obj1������" + count);
					if (s1.tryAcquire(1, TimeUnit.SECONDS)) {
						System.out.println("task1�õ�obj2������" + count);
					}
					s1.release();
				}
				s2.release();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	class Task2 implements Runnable {
		public int count;

		public void setCount(int count) {
			this.count = count;
		}

		@Override
		public void run() {
			try {
				if(s1.tryAcquire(1,TimeUnit.SECONDS)) {
					System.out.println("task2�õ�obj1������" + count);
					if(s2.tryAcquire(1,TimeUnit.SECONDS)) {
						System.out.println("task2�õ�obj2������" + count);
					}
					s2.release();
				}
				s1.release();
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		}

	}
}
