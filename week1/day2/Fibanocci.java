package week1.day2;

public class Fibanocci {
    public void fibanocci(int n)
    {   
    	int a = 0;
    	int b = 1;
    	for(int i=0;i<n;i++)
    	{
        	System.out.print(a + " ");
    		int c = a + b;
    		a = b;
    		b = c;
    	}
    }
	public static void main(String[]args)
	{
		Fibanocci fb = new Fibanocci();
        fb.fibanocci(8);		
	}
}
