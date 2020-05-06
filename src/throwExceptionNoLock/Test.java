package throwExceptionNoLock;

public class Test {
	public static void main(String[] args) {
		try {
			Service service = new Service();
			ThreadA a = new ThreadA(service);
			a.setName("a");
			a.start();
			Thread.sleep(1000);
			ThreadB b = new ThreadB(service);
			b.setName("b");
			b.start();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}


//线程a出现异常并释放锁,线程b进入方法正常打印
//出现异常的锁被自动释放了