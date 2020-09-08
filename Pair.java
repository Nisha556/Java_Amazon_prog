package Amazon;
import java.util.*;
public class Pair  implements Comparable<Pair>{

	int first, second;
	 Pair(int a, int b)
	 {
		 first =a;
		 second = b;
		 
	 }
	 public int compareTo(Pair o)
	 {
		 int x1= first*first;
		 int  y1= second*second;
		 int x2= o.first*o.second;
		 int y2= o.second*o.second;
		 return(x1+y1)-(x2-y2);
	 }
}
class Nearest {
	static void KClosestPoints(int x[], int y[], int n,int k)
	{
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		for(int i = 0;i<n;i++)
		{
			pq.add(new Pair(x[i],y[i]));
			
		}
		for(int i = 0;i<k;i++)
		{
			Pair p = pq.poll();
			System.out.println(p.first + " " +p.second);
			
		}
	}
		public static void main(String args[])
		{
			int x[] = {1,-2};
			int y[] = {3,2};
			int K = 1;
			int n = x.length;
			KClosestPoints(x,y,n,K);
			
			
		}
	}

