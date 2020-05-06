package lockMethodTest1;

public class Run {
	public static void main(String[] args) {
		Service service = new Service();
		service.serviceMethod1();
	}
}
//方法int getHoldCount()的作用是查询当前线程保持此锁定的个数，也就是调用lock方法的次数