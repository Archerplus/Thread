package waitOld;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		String lock = new String("");
		Add add = new Add(lock);
		Subtract subtract = new Subtract(lock);
		ThreadSubtract subthread1Subtract = new ThreadSubtract(subtract);
		subthread1Subtract.setName("subtract1Thread");
		subthread1Subtract.start();
		ThreadSubtract subthread2Subtract = new ThreadSubtract(subtract);
		subthread2Subtract.setName("subtract2Thread");
		subthread2Subtract.start();
		Thread.sleep(1000);
		ThreadAdd addThread = new ThreadAdd(add);
		addThread.setName("addThread");
		addThread.start();
	}
}
