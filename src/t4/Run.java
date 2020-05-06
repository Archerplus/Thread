package t4;

public class Run {
	public static void main(String[] args) {
		MyThread mythread = new MyThread();
		Thread A = new Thread(mythread,"A");
		Thread B = new Thread(mythread,"B");
		Thread C = new Thread(mythread,"C");
		Thread D = new Thread(mythread,"D");
		Thread E = new Thread(mythread,"E");
		A.start();
		B.start();
		C.start();
		D.start();
		E.start();
	}
}
