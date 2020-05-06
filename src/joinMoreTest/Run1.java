package joinMoreTest;

public class Run1 {
	public static void main(String[] args) {
		try {
			ThreadB b = new ThreadB();
			ThreadA a = new ThreadA(b);
			a.start();
			b.start();
//			b.join(2000);
			//可以发现一个规律:main end 往往都是第一个打印的
			//所以可以完全确定地得出一个结论:方法join大部分是先运行的
			//也就是先抢到ThreadB的锁,然后快速释放
			System.out.println("   main end " + System.currentTimeMillis());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
