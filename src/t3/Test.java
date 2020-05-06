package t3;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		PublicVar publicVarRef = new PublicVar();
		ThreadA thread = new ThreadA(publicVarRef);
		thread.start();
		Thread.sleep(200);
		publicVarRef.getValue();
	}
}
