package Amazon;
import java.util.*;
public class subarrayproduct {
static void  product_subarrays(int arr[],  int n)

{
	int  res=1;
	for(int i=0;i<n;i++)
		{
		int product =1;
		for(int  j=i;j<n;j++)
			{
			product = product*arr[j];
			res *= product;
			}
			}
	System.out.println(res +"\n");
	
		}
public static void main(String args[])
{
	int arr [] = {10,6,3};
	int n =arr.length;
	product_subarrays(arr,n);
}
}
