package suspend_resume_deal_lock;

public class SynchronizedObject {
	synchronized public void printSring() {
		System.out.println("begin");
		if(Thread.currentThread().getName().equals("a")) {
			System.out.println("a�߳���Զsuspend��! ");
			Thread.currentThread().suspend();
		}
	}
}
