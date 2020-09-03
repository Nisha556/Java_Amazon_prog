package Amazon;

public class printSubarray {
public static  void main(String arsg[])
{
	printSubarray pt = new printSubarray()
			;
	int arr[]= {1,3,9};
	pt.printSubArray(arr);
}
void printSubArray(int arr[])
{
	int n= arr.length;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			for(int k=i;k<=j;k++)
			{
				System.out.println("sub array print" +arr[k]+" ");
				
			}
			System.out.println();
		}
	}
	
}
}
