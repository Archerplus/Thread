package threadLocal11;

public class Run {
	public static ThreadLocal t1 = new ThreadLocal();
	public static void main(String[] args) {
		if(t1.get() == null) {
			System.out.println("从未放过值");
			t1.set("我的值");
		}
		System.out.println(t1.get());
		System.out.println(t1.get());
	}
}
//从图中的运行结果来看，第一次调用t1对象的get()方法时返回的值是null
//通过调用set()方法赋值后顺利取出值并打印在控制台上。
//类ThreadLocal解决的是变量在不同线程间的隔离性
//也就是不同线程拥有自己的值，不同线程中的值是可以放入ThreadLocal类中进行保存的
