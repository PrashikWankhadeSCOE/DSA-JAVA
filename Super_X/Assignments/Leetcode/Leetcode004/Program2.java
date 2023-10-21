/* 
 * Reverse String (LeetCode - 344)
 * 
 * Write a function that reverses a string. The input string is given as an array
 * of characters s.
 * 
 * You must do this by modifying the input array in-place with O(1) extra
 * memory.
 * 
 * Example 1:
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 * 
 * Example 2:
 * Input: s = ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 * 
 * Constraints:
 * 1 <= s.length <= 10
 * 5
 * 
 * s[i] is a printable ascii character.
 */

import java.util.*;

class Demo{
	static char[] reverseString(char[] arr) {
        	int s = 0;
        	int e = arr.length-1;
        	while(s<e){
            		char ch = arr[s];
	            	arr[s] = arr[e];
        	    	arr[e] = ch;
            		s++;
	            	e--;
        	}
        return arr;
    	}
	/*
	 * TC : O(N)
	 * SC : O(1)
	 */
	public static void main(String []args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char arr[] = new char[n];

		for(int i = 0;i<n;i++){
			arr[i] = sc.next().charAt(0);
		}
		arr = reverseString(arr);
		for(char i : arr){
			System.out.print(i + " ");
		}
	}
}
