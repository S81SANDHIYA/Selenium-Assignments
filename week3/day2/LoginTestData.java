package week3.day2;

public class LoginTestData extends TestData{
   
	public void enterUsername()
	{
		System.out.println("Enter Username --> Login class");
	}
	public void enterPassword()
	{
		System.out.println("Enter password --> Login class");
	}
	
	public static void main(String[]args)
	{
		LoginTestData login = new LoginTestData();
		login.enterCredentials();
		login.enterPassword();
		login.enterUsername();
	}
}
