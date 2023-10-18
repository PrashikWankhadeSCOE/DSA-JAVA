/*
 * 2. Find the Index of the First Occurrence in a String (LeetCode 28)
 * 
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
 * or -1 if needle is not part of haystack.
 * 
 * Example 1:
 * 
 *  Input: haystack = "sadbutsad", needle = "sad"
 *  Output: 0
 *  Explanation: "sad" occurs at index 0 and 6.
 *  The first occurrence is at index 0, so we return 0.
 * 
 * Example 2:
 * 
 *  Input: haystack = "leetcode", needle = "leeto"
 *  Output: -1
 *  Explanation: "leeto" did not occur in "leetcode", so we return -1.
 * 
 * 
 * Constraints:
 * 
 *  1 <= haystack.length, needle.length <= 10^4
 * 
 * haystack and needle consist of only lowercase English characters.
 * 
 */

import java.util.*;
class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String haystack = sc.nextLine();
		String needle = sc.nextLine();
		
		System.out.println(firstOcc(haystack,needle));
	}
	/*
	 * TC : O(N^2)
	 * SC : O(1)
	 */

	static int firstOcc(String haystack,String needle){
		char hs [] = haystack.toCharArray();
        	char ndl[] = needle.toCharArray();
        	if(ndl.length>hs.length){
            		return -1;
        	}
        	for(int i = 0;i<hs.length;i++){
            		int a = i;
            		int count = 0;
            		for(int j = 0;j<ndl.length;j++){
		                if(a>=hs.length){
					break;
                		}
                		if(ndl[j]==hs[a]){
                    			count++;
		    			if(count==ndl.length){
					    	return i;
                    			}
                    			//System.out.println(count);
                		}
                		else{
                    			count = 0;
		    			break;
                		}
                
               			a++;
            		}
        	}
        	return -1;
	}
}

