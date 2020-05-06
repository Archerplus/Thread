package suspend_resume_nosameValue;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		final MyObject myobejct = new MyObject();
		Thread thread1 = new Thread() {
			@Override
			public void run() {
				myobejct.serValue("b", "aa");
			}
		};
		thread1.setName("a");
		thread1.start();
		Thread.sleep(500);
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				myobejct.printUsernamePassword();
			}
		};
		thread2.start();
	}
}
