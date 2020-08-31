package Amazon;
import java.util.*;
import java.util.stream.*;
public class Reverse {
public static void main(String args[])
{
	Integer[] arr= {10,20,30,40,50};
	for(int i=0;i<arr.length;i++)
		System.out.println("Print the value of  normal array"+ arr[i] );
	for(int i=arr.length-1;i>=0;i--)
		System.out.println("print the revesre array" +arr[i]);
	
}
}
