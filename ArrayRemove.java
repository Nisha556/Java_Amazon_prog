package Amazon;
import java.util.Arrays;
import java.util.Scanner;


public class ArrayRemove {
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the size of the array");
	int size= sc.nextInt();
	int [] myArray = new int [size];
System.out.println("Enter the size of the element");
for(int i =0;i<size;i++)
{
	myArray[i]= sc.nextInt();
	
}
System.out.println("the array is created " +Arrays.toString(myArray))
;
for(int i=0;i<myArray.length-1;i++)
{
	for(int j=j+1;j<myArray.length;j++)
	{
		if(myArray[i]==myArray[j])
		{
			myArray= ArrayUtils.remove(myArray,j);
			
		}
	}
}
System.out.println("Array after remove" +Arrays.toString(myArray));
}
}
