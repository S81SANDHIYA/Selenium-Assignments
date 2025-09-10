package week4.day1;

public class Override extends MethodOverloading{
	
	public void reportStep(String message,String status,boolean isSnap)
	{

		super.reportStep(message, status);
		if(isSnap == true)
		{
		System.out.println("Whether to take snapshot or not? : Yes");
		}
		else
		{
			System.out.println("Whether to take snapshot or not? : No");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Override ovr = new Override();
        ovr.reportStep("Transaction is complete", "Completed");
        ovr.reportStep("Transaction processing", "Pending", false);
	}

}
