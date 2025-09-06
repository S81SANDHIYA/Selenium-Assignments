package week3.day1;

import java.util.Arrays;

public class DuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "We learn Java basics as part of java sessions in java week1";
		
		int count = 0;
		String[] s = test.split(" ");
        
		//Comparing
		for(int i=0;i<s.length-1;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].equals(s[j]))
				{
					s[j] = " ";
					count++;
				}
			}
		}
		String str1 = Arrays.toString(s);
        if(count>0)
        {
        	System.out.println(str1);
        }
 	}

}
