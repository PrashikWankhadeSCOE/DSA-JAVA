/*
 * 5. To Lower Case (Leetcode-709)
 * 
 * Given a string s, return the string after replacing every uppercase
 * letter with the same lowercase letter.
 * 
 * Example 1:
 * Input: s = "Hello"
 * Output: "hello"
 * 
 * Example 2:
 * Input: s = "here"
 * Output: "here"
 * 
 * Example 3:
 * Input: s = "LOVELY"
 * Output: "lovely"
 * 
 * Constraints:
 * 1 <= s.length <= 100
 * s consists of printable ASCII characters
 */

import java.util.*;

class Demo{
	/*
	 * TC : O(N);
	 * SC : O(N);
	 *
	 */
	static String convert(String str){
		StringBuffer sb = new StringBuffer("");
		for(int i = 0;i<str.length();i++){
			if(str.charAt(i)<=90 && str.charAt(i)>=65)
				sb.append((char)(str.charAt(i)+32));
			else
				sb.append(str.charAt(i));
			
		}
		return sb.toString();
	}

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		System.out.println(convert(str));
	}
}
