package suspend_resume_LockStop;

public class MyThread extends Thread{
	private long i = 0;
	@Override
	public void run() {
		while(true) {
			i++;
			//当程序运行到println()方法内部停止时,同步锁未被释放
			//导致当前printStream对象的println()方法一直处于暂停状态,
			//并且锁未被释放,而main方法中的代码System.out.println("main end");迟迟不能打印
			System.out.println("i = " + i);
		}
	}
	public long getI() {
		return i;
	}
	public void setI(long i) {
		this.i = i;
	}
}
