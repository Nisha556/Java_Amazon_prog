package Amazon;
import java.util.*;
import java.lang.String;
import java.io.*;
public class DuplicateCharacters {
public static void main(String arsg[])
{
    String string1 = "Great responsibility";  
	int count;
	char string[] = string1.toCharArray();
	System.out.println("Duplicate character");
	for(int i =0;i<string.length;i++)
	{
		count =1;
		for(int j =i+1;j<string.length;j++)
		{
			if(string[i]== string[j]&& string[i] !=' ')
			{
				count++;
				string[j]='0';
				
			}
		}
		if(count>1&& string[i]!='0')
				System.out.println(string[i]);
		
	}
	
	
}
}
