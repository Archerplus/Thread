package inheritableThreadLocal2;

public class Run {
	public static void main(String[] args) {
		try {
			for (int i = 0; i < 10; i++) {
				if (i == 5) {
					Tools.t1.set("Archer");
				}
				System.out.println(" 在main线程中取值 = " + Tools.t1.get());
				Thread.sleep(100);
			}
//			Thread.sleep(100);
			ThreadA a = new ThreadA();
			a.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
// 但在使用InheritableThreadLocal类需要注意的一点是
// 如果子线程在取得值得同时
// 主线程将InheritableThreadLocal中的值进行改变，那么子线程取到的值还是旧值
// 没懂，感觉书上讲的不是特别对的样子