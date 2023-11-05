/*
 * WAP to count the vowel in string 
 */

import java.util.*;

class Demo{
	int count(String str){
		if(str == null || str.length()<=0)
			return 0;
		if(str.charAt(0)=='a' || str.charAt(0)=='e' || str.charAt(0)=='i' || str.charAt(0)=='o' || str.charAt(0)=='u')
			return 1 + count(str.substring(1));
		return count(str.substring(1));
	}
	public static void main(String [] arggs){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(new Demo().count(str));
	}
}
