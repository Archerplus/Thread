package runMethodUseStopMethod;

public class MyThread extends Thread{
	@Override
	public void run() {
		try {
			//调用stop方法时会抛出java.lang.ThreadDeath异常,但在通常情况下,此异常不需要显式地捕捉
			//方法stop()已经被作废,因为如果强制让线程停止则有可能使一些请理性地工作得不到完成
			//另外一个情况就是对锁定地对象进行了解锁,导致数据得不到同步地处理,出现数据不一致地问题
			this.stop();
		}catch(ThreadDeath e) {
			System.out.println("进入了catch()方法");
			e.printStackTrace();
		}
	}
	
}
