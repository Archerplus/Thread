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

//调用关键字synchronized声明的方法一定是排队运行的.
//只有共享资源的读写访问才需要同步化
//如果不是共享的资源,就没有同步化的必要