package join;

import java.util.concurrent.locks.ReentrantLock;

public class FairLock implements Runnable {
	//当构造函数的参数为true时,表示锁时公平的
	//公平锁看起来很优美,但是要实现公平锁必然要求系统维护一个有序队列
	//因为公平锁的实现成本比较高,性能也相对而言比较低下
	//因此,默认情况下,锁是非公平的,如果没有特别需求
	//也不需要使用公平锁
	//公平锁和非公平锁在线程调度表现上也是非常不一样
	public static ReentrantLock fairlock = new ReentrantLock(true);

	@Override
	public void run() {
		while (true) {
			try {
				fairlock.lock();
				System.out.println(Thread.currentThread().getName() + "获得锁");
			} finally {
				fairlock.unlock();
			}
		}
	}
	public static void main(String[] args) {
		FairLock r1 = new FairLock();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		t1.start();
		t2.start();
	}
}
