package Amazon;
import java.util.Scanner;
import java.util.*;
import java.lang.String;
public class StringReverse {
public static String reverseString(String str)
{
	char ch[]= str.toCharArray();
	int n = ch.length;
	char result[] = new char[n];
	for(int i = 0;i< ch.length;i++)
	{
		result[n-1]= ch[i];
		n = n-1;
		
	}
	return  new String(result);
	
}
public static  void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string value");
	String str = sc.next();
	String result = StringReverse.reverseString(str);
	System.out.println(result);
}
}
