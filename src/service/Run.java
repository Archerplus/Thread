package service;

public class Run {
	public static void main(String[] args) {
//		HasSelfPrivateNum numRef = new HasSelfPrivateNum();
//		ThreadA athread = new ThreadA(numRef);
//		athread.start();
//		ThreadB bthread = new ThreadB(numRef);
//		bthread.start();
		Service service = new Service();
		ThreadA a = new ThreadA(service);
		a.setName("a");
		a.start();
		ThreadB b = new ThreadB(service);
		b.setName("b");
		b.start();
		ThreadC c = new ThreadC(service);
		c.setName("c");
		c.start();
	}
}
