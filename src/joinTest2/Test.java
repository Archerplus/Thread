package joinTest2;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		MyThread threadTest = new MyThread();
		threadTest.start();
		threadTest.join();
		System.out.println("���뵱threadTest����ִ����֮������ִ�У���������");
	}
}
