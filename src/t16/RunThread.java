package t16;

public class RunThread extends Thread{
	volatile private boolean isRunning = true;

	public boolean isRunning() {
		return isRunning;
	}

	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}
	
	@Override
	public void run() {
		System.out.println("进入run了");
		while(isRunning) {
//			System.out.println("running");
		}
		System.out.println("线程停止了");
	}
}
