package synLockIn_2;

public class Run {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
	}
}


//当存在父子类继承的时候,子类是完全可以通过"可重入锁"的方式调用父类的同步方法的