package Amazon;
import java.lang.String;
public class SubstringsOfStringMain {
public static void main(String arsg[])
{
	String str = "abbc";
	System.out.println("All substring are");
	for(int i =0;i<str.length();i++)
	{
		for(int j =0;j<str.length();j++)
		{
		
			System.out.println(str.substring(i,j));
			
		}
	}
}
}
