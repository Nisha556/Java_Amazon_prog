package Amazon;
import java.util.*;
import java.lang.String;
public class StringReplace {
public static void main(String args[])
{
	String word = "JAva";
	String replaced = word.replace("J","K")
;
	System.out.println("resplace chak in string" +word);
	System.out.println("replace string " +replaced);
	String str = "Scala is good programming language";
    replaced = str.replaceAll("Scala", "Java");
    System.out.println("String before replace : " + str);
    System.out.println("String after replace : " + replaced);


    replaced = str.replaceFirst("\\s", "#");
    System.out.println("Replacing first match of regex using replaceFirst()");
    System.out.println("Original String before replacement : " + str);
    System.out.println("Final String : " + replaced);


    System.out.println("Replacing all occurrence of substring which match regex");
    replaced = str.replaceAll("\\s", "#");
    System.out.println("ReplaceAll Example : " + replaced);





	}
}
