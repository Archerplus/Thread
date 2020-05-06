package t5;

public class MyThread1 extends Thread{
	private Task task;

	public MyThread1(Task task) {
		this.task = task;
	}
	@Override
	public void run() {
		CommonUtils.beginTime1 = System.currentTimeMillis();
		task.doLongTimeTask();
		CommonUtils.beginTime1 = System.currentTimeMillis();
	}
}
