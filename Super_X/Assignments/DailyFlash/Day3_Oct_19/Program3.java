/*
 * WAP to check whether the given no is a palindrome number or not
 *
 */

import java.util.*;

class Demo{
	static boolean check(int num){
		int temp = num;
		int rev = 0;
		while(temp>0){
			int x = temp%10;
			rev = rev*10 + x;
			temp/=10;
		}
		if(rev == num)
			return true;
		return false;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.println(check(num));
	}
}
