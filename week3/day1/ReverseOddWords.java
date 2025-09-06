package week3.day1;

import java.util.Arrays;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String test = "I am a software tester";
    
    String[] s = test.split(" ");
    
    for(int i=0;i<s.length;i++)
    {
    	if(i%2==1)
    	{
    		char[] ch = s[i].toCharArray();
    		int j = 0;
    		int k = ch.length-1;
    		while(j < k)
    		{
    			char temp = ch[j];
    			ch[j] = ch[k];
    			ch[k] = temp;
    			j++;
    			k--;
    		}
    		s[i] = new String(ch);
    	}
    }
    String str = String.join(" ",s);
    System.out.println(str);
	}

}
