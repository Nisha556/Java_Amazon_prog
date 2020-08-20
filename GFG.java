package Amazon;
//Java code for k largest elements in an array 
import java.util.Arrays;
import java.util.Collections;

public class GFG {
public static void kLarge(Integer[] arr , int k)
{
	// Sort the given array arr in reverse order 
    // This method doesn't work with primitive data 
    // types. So, instead of int, Integer type 
    // array will be used 
    Arrays.sort(arr, Collections.reverseOrder()); 
	for(int i = 0; i<k;i++)
		System.out.println(arr[i] +" ");
	
}
public static void main(String args[])
{
	Integer arr[] = new Integer[] {1,23,12,8,30,2,50
};
	int k = 3;
	kLarge(arr,k);
}	
}
