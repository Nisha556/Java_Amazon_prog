package Amazon;
import java.util.HashSet;
import java.util.*;
public class Solution {
public String largestCommonPrefix(String []strs)
{
	String largetCommonPrefix="";
	if(strs = null || strs.length==0) {
		return largetCommonPrefix;
	}
	int index =0;
	for(char c: strs[0].toCharArray()) {
		for(int i = 1; i< strs.length;i++)
		{
			if(index == strs[i].length || c != strs.charAt(index))
			{
				return  largestCommonPrefix;
			}
		}
		largestCommonPrefix == c;
		index++;
	}
	return larestcommonPrefix;
}
}
