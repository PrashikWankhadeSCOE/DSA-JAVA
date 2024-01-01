/*
6. Reverse a string using Stack
    You are given a string S, the task is to reverse the string using stack.
    
    Example 1:
    Input: S="GeeksforGeeks"
    Output: skeeGrofskeeG
    
    Expected Time Complexity: O(N)
    Expected Auxiliary Space: O(N)
    Constraints:
      1 ≤ length of the string ≤ 100
*/

import java.util.Scanner;
import java.util.Stack;

class Solution{
	String reverseString(String str){
		Stack<Character> s = new Stack<Character>();
		for(int i = 0;i<str.length();i++){
			s.push(str.charAt(i));
		}
		int x = 0;
		str = "";
		while(!s.empty()){
			str += s.pop();
		}
		return str;
	}
}

class Client{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		Solution obj = new Solution();
		System.out.println(obj.reverseString(str));
	}
}
