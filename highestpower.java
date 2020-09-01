package Amazon;

public class highestpower {
static int heighestPowerof2(int n)
{
	int res= 0;
	for(int i=n;i>=1;i--)
	{
		  if ((i & (i - 1)) == 0) 
		{
			res =i;
			 break;
		}
	}
	return res;
	
}
public static void main(String [] args)

{
	int n=10;
	System.out.println(heighestPowerof2(n));
	}
}
