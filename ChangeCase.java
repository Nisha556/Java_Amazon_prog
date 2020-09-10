package Amazon;
import java.lang.String;
public class ChangeCase {
static int i;
static void changecase(String s)
{
	 for(i=0;i<s.length();i++)
	 {
		 int ch = s.charAt(i);
		 if(ch>=65 && ch <91)
		 {
			 ch = ch+32;
			 System.out.println((char)ch);
			 
		 }
		 else if(ch>96 && ch<123)
		 {
			 System.out.println((char)ch);
			 
		 }
		 if(ch==32)
			 System.out.println(" ");
		 
	 }
}
public static void main(String args[])
{
	System.out.println("original string ");
	 System.out.println("Alive is awesome ");
	  ChangeCase.changecase("Alive is awesome ");
}
}
