package Amazon;

public class FindSecondLargestMain {
public static void main(String args[])
{
	int arr []= {1,2,4,6,32,35};
	int secondlarge = findlarge(arr);
	
	System.out.println("second largest"+(arr));
	
}
public static int  findlarge(int array[])
{
	int highest = Integer.MIN_VALUE;
	int secondlarge = Integer.MIN_VALUE;
	for(int i =0;i<array.length;i++)
	{
		if(array[i]>highest)
		{
			secondlarge = highest;
			highest =array[i];
			
			
		}
		else if(array[i]>secondlarge && array[i] != highest)

	{
			secondlarge =array[i];
			}
		
	}
	return secondlarge;	
}
}
