package Amazon;
import java.util.*;
public class subarrays {
static int countOfSubarray(int arr[], int N)
{
	for(int i=0;i<N;i++)
		arr[i]--;
	int []pref= new int[N];
	pref[0] =arr[0];
	for(int i= 1; i<N;i++)
		arr[i]--;
	
	
	for(int i=1;i<N;i++)
		pref[i]= pref[i-1]+arr[i]
;
	HashMap<Integer, Integer> mp = new HashMap<Integer,Integer>();
	int answer =0;
	mp.put(0, 1);
	for(int i=0;i<N;i++)
	{
		if(mp.containsKey(pref[i]))
		{
			answer += mp.get(pref[i]);
            mp.put(pref[i], mp.get(pref[i]) + 1);
            
		}
		else {
			mp.put(pref[i], 1)
;
			}
	}
	return answer;
	
	}
public static void main(String [] args)
{
	int arr[] ={1,1,0};
	int N= arr.length;
	System.out.println(countOfSubarray(arr,N));
}
}
