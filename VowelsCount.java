package Amazon;
import java.lang.String;
public class VowelsCount {
	static int i,c,res;
static  int vowelcount(String s)
{
	for(i=0,c=0;i<s.length();i++)
	{
		char ch = s.charAt(i);
		if((ch=='a')||(ch=='i')||(ch=='o')||(ch=='u')||(ch=='e'))
			c++;
		
	}
	return c;
	
}
public static void main(String args[])
{
	System.out.println("Original String is :");
	System.out.println("Nisha is a good girl");
	res = VowelsCount.vowelcount("Nisha is a good girl");
	System.out.println("The number of  vowel is " +res);
	
}
}
