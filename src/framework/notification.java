package framework;

public class notification {
	
	public static startApplication sa = new startApplication();
	
	public static void main(String[] args) throws InterruptedException {
		
		sa.loginToApp("usename", "password");
		
	}

}
