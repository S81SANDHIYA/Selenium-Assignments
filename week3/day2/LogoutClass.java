package week3.day2;

public class LogoutClass extends TestData{
	
	public void logout()
	{
		System.out.println("Logging out --> Logout class");
	}
    public static void main(String[] args)
    {
    	LogoutClass logout = new LogoutClass();
    	logout.enterCredentials();
    	logout.navigateToHomePage();
    	logout.logout();
    }
}
