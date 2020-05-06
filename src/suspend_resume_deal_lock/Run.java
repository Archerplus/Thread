package suspend_resume_deal_lock;

import suspend_resume_test.MyThread;

public class Run {
	public static void main(String[] args) {
		try {
			final SynchronizedObject object = new SynchronizedObject();
			Thread thread1 = new MyThread() {
				@Override
				public void run() {
					object.printSring();
				}
			};
			thread1.setName("a");
			thread1.start();
			Thread.sleep(1000);
			Thread thread2 = new MyThread() {
				@Override
				public void run() {
					System.out.println("thread2 启动了,但进入不了printString方法!只打印了1个begin");
					System.out.println("因为printString()方法被a线程锁定并且永远suspend暂停了");
					object.printSring();
				}
			};
			thread2.start();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
