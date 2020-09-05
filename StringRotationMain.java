package Amazon;
import java.lang.String;
public class StringRotationMain {
public static void main(String args[])
{
	System.out.println("IndiaVsAus rotate each other"+isRotate("indiaVsAus","AusVsindia"));
	System.out.println("NishaShandilya rotate each other"+isRotate("Nisha","Shandilya"));
	
}
public static boolean isRotate(String str, String rotation)
{
	String str2 = str+str;
	if(str2.contains(rotation))
	{
		return true;
	}
	return false;
}
}
