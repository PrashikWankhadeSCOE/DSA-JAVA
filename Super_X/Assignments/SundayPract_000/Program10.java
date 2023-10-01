/*
 * WAP to check wheather a given string is Palinrome string or not 
 * Input : malyalam
 * Output : true
 */

import java.util.*;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		System.out.println(palindrome(str));
	}
	static boolean palindrome(String str){
		StringBuffer sb = new StringBuffer("");
		for(int i = str.length()-1;i>=0;i--){
			sb.append(str.charAt(i));
		}
		String s = new String(sb);
		if(s.equals(str))
			return true;
		return false;
	}
}
