package suspend_resume_nosameValue;

public class MyObject {
	private String username = "1";
	private String password = "11";
	public void serValue(String u,String p) {
		this.username = u;
		if(Thread.currentThread().getName().equals("a")) {
			System.out.println("Õ£÷πaœﬂ≥Ã");
			Thread.currentThread().suspend();
		}
		this.password = p;
	}
	public void printUsernamePassword() {
		System.out.println(username + " " + password);
	}
}
