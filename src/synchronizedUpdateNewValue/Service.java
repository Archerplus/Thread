package synchronizedUpdateNewValue;

public class Service {
	private boolean isConditionRun = true;
	public void runMethod() {
		String anyString = new String();
		while(isConditionRun) {
			synchronized (anyString) {
				
			}
		}
		System.out.println("ͣ������");
	}
	public void stopMethod() {
		isConditionRun = false;
	}
}
