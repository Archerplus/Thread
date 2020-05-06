package joinTest1;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		MyThread threadTest = new MyThread();
		threadTest.start();
		System.out.println("我想当threadTest对象执行完之后我再执行");
		System.out.println("但上面的代码中的sleep的值该怎么写呢？");
		System.out.println("答案是：根本不能确定");
	}
}
