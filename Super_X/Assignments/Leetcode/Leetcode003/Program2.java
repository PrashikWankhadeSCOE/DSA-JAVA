/*
 * 6. Plus One (Leetcode-66)
 * 
 * You are given a large integer represented as an integer array digits,
 * where each digits[i] is the ith digit of the integer. The digits are
 * ordered from most significant to least significant in left-to-right order.
 * The large integer does not contain any leading 0's.
 * Increment the large integer by one and return the resulting array of
 * digits.
 * 
 * Example 1:
 *  Input: digits = [1,2,3]
 *  Output: [1,2,4]
 *  Explanation: The array represents the integer 123.
 *  Incrementing by one gives 123 + 1 = 124.
 *  Thus, the result should be [1,2,4].
 * 
 * Example 2:
 *  Input: digits = [4,3,2,1]
 *  Output: [4,3,2,2]
 *  Explanation: The array represents the integer 4321.
 *  Incrementing by one gives 4321 + 1 = 4322.
 *  Thus, the result should be [4,3,2,2].
 * 
 * Example 3:
 *  Input: digits = [9]
 *  Output: [1,0]
 *  Explanation: The array represents the integer 9.
 *  Incrementing by one gives 9 + 1 = 10.
 *  Thus, the result should be [1,0].
 * 
 * Constraints:
 * 
 * 1 <= digits.length <= 100
 * 0 <= digits[i] <= 9
 * 
 * digits does not contain any leading 0's.
 */

import java.util.*;

class Demo{
	static int [] plusOne(int arr[]){
		long num = 0;
		for(int i = 0;i<arr.length;i++){
			num = num*10+(arr[i]-'0');
		}
		num++;
		
		//System.out.println(num);

		String str = String.valueOf(num);
		char ret[] = str.toCharArray();
		
		//System.out.println(str);

		int ret2[] = new int[ret.length];
		for(int i = 0;i<ret.length;i++){
			ret2[i] = (int)(ret[i]-'0');
		}
		return ret2;
	}
	public static void main(String []a){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		int arr[] = new int[str.length()];

		for(int i = 0;i<arr.length;i++){
			arr[i] = str.charAt(i);
		}
		int ret[] = plusOne(arr);

		for(int i = 0;i<ret.length;i++){
			System.out.print(ret[i] + " ");
		}
	}
}
