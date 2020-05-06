package join;

import java.util.concurrent.locks.ReentrantLock;

public class IntLock implements Runnable {
	// ����һ�����������Ķ���
	public static ReentrantLock lock1 = new ReentrantLock();
	public static ReentrantLock lock2 = new ReentrantLock();
	int lock;
	/*
	 * 
	 * ���Ƽ���˳��
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
			System.out.println(Thread.currentThread().getId() + ":�߳��˳�");
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
	
	//�߳�t1��t2������,
	//t1��ռ��lock1,��ռ��lock2
	//t2��ռ��lock2,������lock1
	//���,�������γ�t1��t2֮��Ļ���ȴ�
	//lockInterruptibly()����
	//����һ�����Զ��жϽ�����Ӧ�������붯��
	//���ڵȴ����Ĺ�����
	//������Ӧ�ж�
	
}
