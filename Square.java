package Amazon;
import java.io.*;
import java.util.*;
public class Square {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of a");
		double a = sc.nextDouble();
		//System.out.println("Enter the value of a" +a);
		System.out.println("Enter the value of b");
		double b = sc.nextDouble();
		
	double  e =(2*a*b);
		double c= Math.pow(a, 2);
		double d =Math.pow(b,2);
		 System.out.println("The value of the square" +(e+c+d));
	}
}