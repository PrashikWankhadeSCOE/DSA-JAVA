// Not Done
//
/* 
 * Multiply Strings (LeetCode - 43)
 * 
 * Given two non-negative integers num1 and num2 represented as strings,
 * return the product of num1 and num2, also represented as a string.
 * 
 * Note: You must not use any built-in BigInteger library or convert the inputs
 * to integers directly.
 * 
 * Example 1:
 * Input: num1 = "2", num2 = "3"
 * Output: "6"
 * 
 * Example 2:
 * Input: num1 = "123", num2 = "456"
 * Output: "56088"
 * 
 * Constraints:
 * 1 <= num1.length, num2.length <= 200
 * num1 and num2 consist of digits only.
 * 
 * Both num1 and num2 do not contain any leading zero, except the number 0
 * itself.
 */

import java.util.*;

class Demo{
	static String multiplyString(String num1,String num2){
		long n1 = Long.valueOf(num1);
		long n2 = Long.valueOf(num2);

		long mult = n1*n2;
		return String.valueOf(mult);
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String num1 = sc.nextLine();
		String num2 = sc.nextLine();

		System.out.println(multiplyString(num1,num2));

	}
}
