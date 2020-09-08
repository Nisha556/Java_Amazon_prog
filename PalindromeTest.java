package Amazon;
import java.lang.*;
import java.lang.String;

public class PalindromeTest {
public static void main(String args[])
{
	System.out.println("IS aaa palindrom ?" +isPalindromString("aaa"));
	System.out.println("Is abc palindrom? :" + isPalindromString("abc"));
	System.out.println("IS palindrom or not ? : " + isPalindromString("abb"));
	
}
public static boolean isPalindromString(String text)
{
	String reverse = reverse(text);;
	if(text.equals(reverse))
	{
		return true;
		
	}
	return false;
	
	
	
}
public static String reverse(String input)
{
	if(input == null || input.isEmpty())
	{
		return input;
		
	}
	return input.charAt(input.length()- 1) 
            + reverse(input.substring(0, input.length() - 1));




	
}
}
