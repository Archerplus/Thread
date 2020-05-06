package test;

//此类是为了检测线程调用的随机性
//个人认为，多线程的调用应该是在程序最开始的时候判断main方法里面是否创建了子线程，
//然后再去调用这些子线程的run方法
//另外线程的先后调用顺序是随机的
//取决与对CPU资源的抢占
public class doThreadMethod {
	public static void main(String[] args) {
		new A().start();
		System.out.println("I ");
		System.out.println("am ");
		new B().start();
		System.out.println("hello ");
		new C().start();
		System.out.println("world");
	}
}

class A extends Thread {
	@Override
	public void run() {
		System.out.println("a");
		this.getName();
		Thread.currentThread().getName();
	}
}

class B extends Thread {
	@Override
	public void run() {
		System.out.println("b");
	}
}

class C extends Thread {
	@Override
	public void run() {
		System.out.println("c");
	}
}
