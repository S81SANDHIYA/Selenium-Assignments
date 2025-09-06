package week3.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr = {1,4,3,2,8,6,7};
      
      //sort the array
      
      Arrays.sort(arr);
      
      int n = 0;
      for(int i=0;i<arr.length;i++)
      {
    	  if(arr[i]!=i+1)
    	  {
    		  n = i+1;
    		  break;
    	  }
      }
      System.out.println(n);
	}
}