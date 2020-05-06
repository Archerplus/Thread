package join;

import java.util.concurrent.locks.ReentrantLock;

public class IntLock implements Runnable {
	// 创建一个可重入锁的对象
	public static ReentrantLock lock1 = new ReentrantLock();
	public static ReentrantLock lock2 = new ReentrantLock();
	int lock;
	/*
	 * 
	 * 控制加锁顺序
	 * 
	 * @param lock
	 */

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			if (lock == 1) {
				lock1.lockInterruptibly();
				Thread.sleep(500);
				lock2.lockInterruptibly();
			}else {
				lock2.lockInterruptibly();
				Thread.sleep(500);
				lock1.lockInterruptibly();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(lock1.isHeldByCurrentThread())
				lock1.unlock();
			if(lock2.isHeldByCurrentThread())
				lock2.unlock();
			System.out.println(Thread.currentThread().getId() + ":线程退出");
		}

	}

	public IntLock(int lock) {
		super();
		this.lock = lock;
	}
	public static void main(String[] args) {
		IntLock r1 = new IntLock(1);
		IntLock r2 = new IntLock(2);
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();t2.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t2.interrupt();
	}
	
	//线程t1和t2启动后,
	//t1先占用lock1,再占用lock2
	//t2先占用lock2,再请求lock1
	//因此,很容易形成t1和t2之间的互相等待
	//lockInterruptibly()方法
	//这是一个可以对中断进行响应的锁申请动作
	//即在等待锁的过程中
	//可以响应中断
	
}
