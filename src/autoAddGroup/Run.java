package autoAddGroup;

public class Run {
	public static void main(String[] args) {
		// 方法activeGroupCount()取得当前线程组对象中的子线程组数量
		// 方法enumerate()的作用是将线程组中的 子线程组以复制的形式
		// 拷贝到ThreadGroup[]数组对象中
		System.out.println("A处线程：" + Thread.currentThread().getName() + " 所属的线程组名为："
				+ Thread.currentThread().getThreadGroup().getName() + " " + " 中有线程组数量："
				+ Thread.currentThread().getThreadGroup().activeGroupCount());
		ThreadGroup[] threadGroup = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
		Thread.currentThread().getThreadGroup().enumerate(threadGroup);
	}
}
