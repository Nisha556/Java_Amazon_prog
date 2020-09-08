package Amazon;
import java.lang.String;

public class FinalReverseWithoutUsingStringMethods {
String str = "Automation";
StringBuilder str2 = new StringBuilder();
str2.append(str);
str2 = str2.reverse();
System.out.println(str2);
}
}