package setNewStringTwoLock;

public class Run1 {
	public static void main(String[] args) {
		MyService service = new MyService();
		ThreadA a = new ThreadA(service);
		ThreadB b = new ThreadB(service);
		a.setName("A");
		b.setName("B");
		a.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b.start();
	}
}



//emmmmm,懒得去敲代码了
//主要讲的意思就是如果在线程中,持有的对象锁不是同一个
//那么这些线程就是在异步进行
//否则就是在同步进行
//只要对象不变,即使对象的属性变了
//运行的结果还是不会改变
//说明synchronized锁使对象锁
//为什么我都能看懂还要去敲这些代码呀
//哎!!!,想想真类
//可能就只是知道个大概吧
//多敲代码能加深理解
//所以咯,好事多磨,多敲点总是没坏处的
