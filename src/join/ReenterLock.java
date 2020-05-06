package join;

import java.util.concurrent.locks.ReentrantLock;

public class ReenterLock implements Runnable{
	public static ReentrantLock lock = new ReentrantLock();
	public static int i = 0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int j = 0;j < 1000000;j++) {
			lock.lock();
			try {
				i++;
			}finally {
				lock.unlock();
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		ReenterLock t1 = new ReenterLock();
		Thread t2 = new Thread(t1);
		Thread t3 = new Thread(t1);
		t2.start();
		t3.start();
		t2.join();
		t3.join();
		System.out.println(i);
	}
}
