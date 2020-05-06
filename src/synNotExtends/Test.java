package synNotExtends;

public class Test {
	public static void main(String[] args) {
		Sub subRef = new Sub();
		ThreadA a = new ThreadA(subRef);
		a.setName("A");
		a.start();
		ThreadB b = new ThreadB(subRef);
		b.setName("B");
		b.start();
	}
}

//从上面的控制台输出结果中我们知道
//同步不能继承,所以如果要实现同步,还得加上synchronized关键字