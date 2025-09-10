package week4.day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingNumber {

	public static void main(String[] args) {
     
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 10, 6, 8);
		Collections.sort(list);
		for(int i=0; i<list.size()-1;i++)
		{
			if(list.get(i)+ 1!= list.get(i+1))
			{
				for(int j = list.get(i)+1; j < list.get(i+1) ;j++)
				{
					System.out.print(j +" ");
				}
			}
		}
		}

}
