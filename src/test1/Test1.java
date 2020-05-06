package test1;

public class Test1 {
	public static void main(String[] args) {
		//出现异常的原因是没有对象监视器，也就是没有同步加锁
		try {
			String newString = new String("");
			newString.wait();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
