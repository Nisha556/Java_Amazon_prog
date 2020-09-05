package Amazon;
 import java.lang.String;
 import java.lang.*;
public class LenghtOfStringMain {
 public static void main(String args[])
 {
	 String  helloworld= "This is hello world";
	 System.out.println("Length of hello world" +getlength(helloworld));
	 
 }
 public static int getlength(String str) {
	 int length =0;
	 char[] strCharArray = str.toCharArray();
	 for( char c : strCharArray)
	 {
		 length++;
	 }
	 return length;
 }
}
