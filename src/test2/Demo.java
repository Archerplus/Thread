package test2;

public class Demo extends Thread {
	public Demo() {
		//当前正在运行的线程的名字
		System.out.println("Thread.currentThread().getname()=" + Thread.currentThread().getName());
		//调用当前对象的名字
		System.out.println("This.getName=" + this.getName());
	}

	public void run() {
		System.out.println("Thread.currentThread().getname()=" + Thread.currentThread().getName());
		System.out.println("This.getName=" + this.getName());
	}

	public static void main(String[] args) {
		//thread和t1是两个不同的对象,唯一的特点就是thread作为一个属性值存在于t1中
		//当运行t1.start()方法的时候
		//因为thread将run方法重写了,
		//所以调用的还是thread.run()方法
		Demo thread = new Demo();
		thread.setName("Archer");
		Thread t1 = new Thread(thread);
		//改变的只是t1的名字和thread没有关系
		t1.setName("A");
		t1.start();
//		Demo thread = new Demo();
//		thread.setName("Archer");
//		thread.start();
	}
}
class A implements Runnable{
	@Override
	public void run() {
		System.out.println();	
	}
}


