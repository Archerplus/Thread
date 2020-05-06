package synLockIn_1;

public class Service {
	synchronized public void service1() {
		System.out.println("service1");
		service2();
	}
	synchronized public void service2() {
		System.out.println("service2");
		service3();
	}
	synchronized public void service3() {
		System.out.println("service3");
	}
}


//关键字synchronized拥有锁重入的功能,也就是在使用synchronized时,
//当一个线程得到一个对象锁之后,再次请求此对象锁时是可以再次得到该对象的锁的.
//这也证明在一个synchronized方法或代码块的内部调用本类的其他synchronized方法或代码块时
//是可以永远得到锁的