package week4.day1;

public class MethodOverloading {
    
	public void reportStep(String message,String status)
	{
		System.out.println("The message is: "+message);
		System.out.println("The status is: "+status);
	}
	public void reportStep(String message,String status,boolean isSnap)
	{
		System.out.println("The message is: "+message);
		System.out.println("The status is: "+status);
		if(isSnap == true)
		{
		System.out.println("Whether to take snapshot or not? : Yes");
		}
		else
		{
			System.out.println("Whether to take snapshot or not? : No");
		}
	}
	public static void main(String[]args)
	{
		MethodOverloading mo = new MethodOverloading();
		mo.reportStep("Transaction made","Completed");
		mo.reportStep("Transaction processing", "Pending", true);
	}
}
