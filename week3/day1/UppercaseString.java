package week3.day1;

public class UppercaseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		
		char[] s = test.toCharArray();
		
		for(int i=0;i<s.length;i++)
		{
			if(i%2==1)
			s[i] = Character.toUpperCase(s[i]);
		}
		String str = new String(s);
		System.out.println(str);
		
	}

}
