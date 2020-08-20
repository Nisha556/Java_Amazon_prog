package Amazon;
//A Java program that returns true if there is a Pythagorean 
//Triplet in a given array. 
import java.io.*;
public class PythagoreanTriplet {
static boolean isTriplet(int ar[] , int n)
{
	for(int i = 0; i<n;i++)
	{
		System.out.println("the value of for loop  i" +i);
		for(int j=  i+1; j<n;j++)
		{
			System.out.println("the  value of for loop j" +j);
			for(int k = j+1; k<n;k++)
			{
				System.out.println("The value of for loop k" +k);
				int x= ar[i]*ar[i];
				System.out.println( "the value of x"  +x);
				 int  y =ar[j]*ar[j];
				 System.out.println("the value of y"  +y);
				 
				 int  z= ar[k]*ar[k];
				 System.out.println("the value if z"  +z);
				 if(x==y+z|| y ==x+z||z==x+y)
					 return true;
			}
		}
	}
	return false;
}
public static void main(String args[])
{
	int ar[] = {3, 1, 4, 6, 5};
	int ar_size = ar.length;
	if(isTriplet(ar, ar_size) == true)
		System.out.println("Yes");
	else
		System.out.println("No");
}
}
