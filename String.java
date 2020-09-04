package Amazon;
//Java program to output the maximum occurring character 
//in a string 
import java.util.*;

import java.io.*;
import java.lang.String;

public class String {
static char getMaxOccuringChar(String str)
{
	int count[]= new int[ASCII_SIZE];
	int len = str.length();
	for(int i=0;i<len;i++)
		count[str.charAt(i)]++;
	int max =-1;
	char result =' ';
	for(int  i =0;i<len;i++) {
		if(max <cont[str.charAt(i)])
		{
			 max = count[str.charAt(i)]; 
             result = str.charAt(i); 
             
		}
	}
	return result;
	
}
public static void main(String args[])
{
	String str= "sample string";
	System.out.println("Max occurring character is "  + 
			"                            getMaxOccuringChar(str)); 
}
}
