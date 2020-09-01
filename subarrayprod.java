package Amazon;
import java.util.*;
public class subarrayprod {
static void product_subarrays(int arr[],int n)
{
	int  product =1;
	for(int  i=0;i<n;i++)
	{
		for(int j=i;j<n;j++)
		{
			for(int k = i;k<=j;k++)
				product *= arr[j];
			
		}
	}
	System.out.println(product + "\n");
}
public static void main(String args[])
{
	int arr[] = {10,3,7};
	int n = arr.length;
	product_subarrays(arr,n);
}
}
