/* 
 *
 * 1. Palindrome Number (LeetCode 9)
 *
 * Given an integer x, return true if x is a 
 * palindrome, and false otherwise.
 * 
 * Example 1:
 * 
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * Example 2:
 * 
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 * 
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 *  
 * 
 * Constraints:
 * 
 * -2^31 <= x <= 2^31 - 1
 */

import java.util.*;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		System.out.println(pallindromeCheck(x));
	}
	static boolean pallindromeCheck(int x){
		int temp = x;
		int rev = 0;
		while(temp>0){
			int a = temp%10;
			rev = rev*10+a;
			temp/=10;
		}
		if(rev == x){
			return true;
		}
		return false;
	}
}

