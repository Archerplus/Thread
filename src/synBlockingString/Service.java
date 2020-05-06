package synBlockingString;

public class Service {
	private String usernameParam;
	private String passwordParam;
	private String anyString = new String();
	public void setUsernamePassword(String username,String password) {
		try {
			synchronized (anyString) {
				System.out.println("线程名称为: " + Thread.currentThread().getName() + " 在 " + System.currentTimeMillis() + " 进入代码块");
				usernameParam = username;
				Thread.sleep(3000);
				passwordParam = password;
				System.out.println("线程名称为: " + Thread.currentThread().getName() + " 在 " + System.currentTimeMillis() + " 离开代码块");
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

//锁非this对象具有一定的优点:如果在一个类中有很多个synchronized方法,
//这时虽然能实现同步,但会收到阻塞,所以影响运行效率;
//但如果使用同步代码块锁非this对象,则synchronized(非this)代码块中的程序与同步方法是异步的,
//不与其他锁this同步方法争抢this锁,则可大大提高运行效率



//使用"synchronized(非this对象x)同步代码块"格式进行同步操作
//对象监视器必须是同一个对象
//如果不是同一个对象监视器
//运行的结果就是异步调用了,就会交叉运行