/*
 * 1. Reverse Integer (Leetcode:- 7)
 *
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing
 * x causes the value to go outside the signed 32-bit integer range [-231, 231
 * - 1], then return 0.
 *
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 *
 * Example 1:
 * Input: x = 123
 * Output: 321
 *
 * Example 2:
 * Input: x = -123
 * Output: -321
 *
 * Example 3:
 * Input: x = 120
 * Output: 21
 *
 * Constraints:
 * -231 <= x <= 231 - 1
 *
 */

import java.util.*;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.println(reverseInt(num));
	}
	static int reverseInt(int num){
		int temp = num;
		int ret = 0;
		while(temp>0){
			int z = temp%10;
			ret = ret*10 + z;
			temp= temp/10;
		}

		if(ret<-2147483648 ||ret >2147483647 ){
         		   return 0;
        	}
		return ret;
	}
}





















