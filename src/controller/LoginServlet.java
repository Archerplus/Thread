package controller;

public class LoginServlet {
	private static String userNameRef;
	private static String passwordRef;
	synchronized public static void doPost(String userName,String password) {
			userNameRef = userName;
			if(userName.equals("a")) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			passwordRef = password;
			System.out.println("username = " + userNameRef + " password = " + passwordRef);
	}
}
