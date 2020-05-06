package synLockIn_1;

public class Run {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
	}
}


//可重入锁的概念是:自己可以再次获取自己的内部锁
//比如有一条线程获得了某个对象的锁,此时这个对象还没有释放
//当其再次想要获取这个对象的锁的时候还是可以获取的
//如果不可锁重入的话,就会造成死锁