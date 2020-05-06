package userReturnInterrupt;

public class MyThread extends Thread{
	@Override
	public void run() {
		while(true) {
			//利用isInterrupted方法和return来终止线程
			//不过还是建议用抛异常的方法来实现线程的停止
			//因为在catch块中还可以将异常往上抛,使线程停止的事件得以传播
			if(this.isInterrupted()) {
				System.out.println("停止了");
				return ;
			}
			System.out.println("timer = " + System.currentTimeMillis());
		}
	}
}
