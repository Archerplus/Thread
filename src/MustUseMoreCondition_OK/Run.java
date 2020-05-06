package MustUseMoreCondition_OK;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		MyService service = new MyService();
		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();
		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();
		Thread.sleep(3000);
		service.signalAll_A();
	}
}
//通过此实验可以得知，使用ReentrantLock对象可以唤醒指定种类的线程，
//这是控制部分线程行为的方便