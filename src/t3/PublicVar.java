package t3;

public class PublicVar {
	public String username = "A";
	public String password = "AA";

	synchronized public void setValue(String username, String password) {
		try {
			this.username = username;
			Thread.sleep(5000);
			this.password = password;
			System.out.println("setValue method thread name = " + Thread.currentThread().getName() + " username = "
					+ username + " password = " + password);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	//出现脏读是因为public void getValue()方法不是同步的
	//所以可以在任意时候进行调用
//	public void getValue() {
//		System.out.println("getValue method thread name = " + Thread.currentThread().getName() + " username = "
//				+ username + " password = " + password);
//	}
	
	//方法setValue()和getValue()是依次执行的
	synchronized public void getValue() {
		System.out.println("getValue method thread name = " + Thread.currentThread().getName() + " username = "
				+ username + " password = " + password);
	}
	//当A线程
}
