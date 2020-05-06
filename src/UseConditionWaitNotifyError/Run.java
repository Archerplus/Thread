package UseConditionWaitNotifyError;

public class Run {
	public static void main(String[] args) {
		MyService service = new MyService();
		ThreadA a = new ThreadA(service);
		a.start();
	}
}
//报错的异常信息是监视器出错，解决的办法是必须在condition.await()方法调用之前调用lock.lock()代码获得同步监视器