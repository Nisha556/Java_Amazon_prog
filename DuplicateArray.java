package Amazon;

//let's see our Java solution for removing duplicates from integer array:

import java.util.Arrays;

public class DuplicateArray {
	  public static void main(String[] args) {  

	   int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};   
       
       System.out.println("Duplicate elements in given array: ");  
	for(int i=0;i<arr.length;i++)
	{
		for(int j =i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				System.out.println(arr[j]);
				
			}
			System.out.println(arr[j]);
		}
	}
}
}

