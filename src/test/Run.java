package test;

import t3.MyThread;

//import myrunnable.MyRunnable;
//import mythread.MyThread;

public class Run {
	public static void main(String[] args) {
//		Runnable runnable = new MyRunnable();
//		Thread thread = new Thread(runnable);
//		thread.start();
//		System.out.println("���н���");
		
		//����������
//		MyThread a = new MyThread("A");
//		MyThread b = new MyThread("B");
//		MyThread c = new MyThread("C");
//		a.start();
//		b.start();
//		c.start();
		
		MyObject object = new MyObject();

        //�߳�A���߳�B ���е���ͬһ������:object
        ThreadA a = new ThreadA(object);
        ThreadB b = new ThreadB(object);
        a.start();
        b.start();
	}
}
