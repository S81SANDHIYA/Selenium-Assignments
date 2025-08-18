package week1.day2;

public class IsPrime {
 
	public boolean prime(int n)
	{
		for(int i = 2 ; i < n ; i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   IsPrime obj = new IsPrime();
       if(obj.prime(10)==true)
       {
    	   System.out.println("10 is prime");
       }
       else
       {
    	   System.out.println("10 is not a prime");
       }
	}

}
