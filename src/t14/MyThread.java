package t14;

public class MyThread extends Thread{
	@Override
	public void run() {
		//如果在sleep状态下停止某一线程,会进入catch语句
		//并且清除停止状态值,使之变成false
		try {
			System.out.println("run begin");
			Thread.sleep(10000000);
			System.out.println("run end");
		} catch (InterruptedException e) {
			System.out.println("在沉睡中被停止,进入catch" + this.isInterrupted());
			e.printStackTrace();
		}
	}
}
