package Amazon;

import java.util.Arrays;

public class ReverseArray {
public static void main(String args[])
{
	String [] name = {"John", "Luke","Mike"};
	System.out.println("original" +Arrays.toString(name));
	reverse(name);
	System.out.println("reverse " +Arrays.toString(name));
	String [] test = {"John"};
	System.out.println("original" +Arrays.toString(test))
	;
	reverse(test);
	System.out.println("reverse" +Arrays.toString(test));
}
	 public static void reverse(String [] array)

	 {
		 if(array == null || array.length<2)
		 {
			 return;
			 
		 }
		 for(int i =0; i<array.length/2;i++)
		 {
			 String temp = array[i];
			 System.out.println(temp);
			 array[i] = array[array.length-1-i];
			 System.out.println(array[i]);
			 
			 array[array.length-1-i] = temp;
			 System.out.println(array[array.length-1-i]);
		 }
		 
	 }
}

