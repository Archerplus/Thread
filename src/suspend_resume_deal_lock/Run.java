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
					System.out.println("thread2 ������,�����벻��printString����!ֻ��ӡ��1��begin");
					System.out.println("��ΪprintString()������a�߳�����������Զsuspend��ͣ��");
					object.printSring();
				}
			};
			thread2.start();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
