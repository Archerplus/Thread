package joinTest1;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		MyThread threadTest = new MyThread();
		threadTest.start();
		System.out.println("���뵱threadTest����ִ����֮������ִ��");
		System.out.println("������Ĵ����е�sleep��ֵ����ôд�أ�");
		System.out.println("���ǣ���������ȷ��");
	}
}
