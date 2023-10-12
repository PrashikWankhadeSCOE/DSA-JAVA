/*
 *
 * Problem 3 :
 * Given a string s and an array of string words, determine wheather s is a prefix string of words
 *
 * A string is prefix string of words if s can  be made by concatenating the first k strings in words 
 * for some positive k no larger than words.length
 *
 * Return true if s is a prefix string of words, or false otherwise
 *
 * Example 1 :
 * Input :
 * s = "iloveleetcode"
 * words = ["i","love","leetcode","apples"]
 * 
 * Output : 
 * true
 *
 * Explanation :
 * s can be made by cancatenating "i","love","leetcode" together
 *
 */

import java.util.*;

class Demo{
	public static void main(String [] ag){
		Scanner sc = new Scanner(System.in);

		//String s = sc.nextLine();

		int n = sc.nextInt();
		
		String [] words = new String[n];
		
		for(int i = 0;i<words.length;i++){
			words[i] = sc.nextLine();
		}
		
		System.out.println(words[0]);

		for(String i : words){
			System.out.println(i);
		}

		System.out.println(prefString(words,s));

	}
	static boolean prefString(String [] words ,String s){
		StringBuffer sb = new StringBuffer(s);

		//StringBuffer ss = new StringBuffer("");

		for(int i = 0;i<words.length;i++){
			StringBuffer ss = new StringBuffer("");
			for(int j = i;j<words.length;j++){
				ss.append(words[j]);
				if(ss.equals(sb))
					return true;
			}
		}
		return false;
	}
}

