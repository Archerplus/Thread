package joinTest2;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		MyThread threadTest = new MyThread();
		threadTest.start();
		threadTest.join();
		System.out.println("我想当threadTest对象执行完之后我再执行，我做到了");
	}
}
