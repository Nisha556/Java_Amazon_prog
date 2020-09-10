package Amazon;
import java.lang.String;
public class ArrayLargestValue {
 static int i, j,res,max,temp=0,a[];
public static void main(String args[])
{
	res = ArrayLargestValue.max(new int[] {173,29,391});
	System.out.println("largest value of the array" +res);
	
}
static int max(int a[])
{
	 max =0;
	 for(i=0;i<a.length;i++)
	 {
		 if(a[i]>= a[max])
			 max =i;
		 
	 }
	 return (a[max]);
}
}
