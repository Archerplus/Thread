package synchronizedmMethodLockObject;

public class Run {
	public static void main(String[] args) {
		MyObject object = new MyObject();
		ThreadA a = new ThreadA(object);
		a.setName("A");
		ThreadA b = new ThreadA(object);
		b.setName("B");
		a.start();
		b.start();
	}
}

//���ùؼ���synchronized�����ķ���һ�����Ŷ����е�.
//ֻ�й�����Դ�Ķ�д���ʲ���Ҫͬ����
//������ǹ������Դ,��û��ͬ�����ı�Ҫ