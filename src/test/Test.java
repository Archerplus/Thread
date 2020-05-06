package test;
import java.util.HashMap;
import java.util.Map;
public class Test {
	public static void main(String[] args) {
		//在控制台中输出的main其实就是y一个名称叫做main的线程在执行main()方法中的代码.
		//在控制台输出的main和main()方法没有任何关系,仅仅时名字相同而已
//		System.out.println(Thread.currentThread().getName());
		
//		MyThread thread = new MyThread();
//		thread.setName("mythread");
//		thread.start();
//		for(int i = 0;i < 10;i++) {
//			int time = (int)(Math.random() * 1000);
//			try {
//				Thread.sleep(time);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println("main=" + Thread.currentThread().getName() + "\t\t\tnum: " + i);
//		}
		
		//执行start()方法的顺序不代表线程启动的顺序
//		MyThread t1= new MyThread(1);
//		MyThread t2= new MyThread(2);
//		MyThread t3= new MyThread(3);
//		MyThread t4= new MyThread(4);
//		MyThread t5= new MyThread(5);
//		MyThread t6= new MyThread(6);
//		MyThread t7= new MyThread(7);
//		MyThread t8= new MyThread(8);
//		t1.start();
//		t2.start();
//		t3.start();
//		t4.start();
//		t5.start();
//		t6.start();
//		t7.start();
//		t8.start();
		
		//getId()方法取得线程的唯一标识符
//		Thread runThread = Thread.currentThread();
//		System.out.println(runThread.getName() + " " + runThread.getId());
		
	}
}
